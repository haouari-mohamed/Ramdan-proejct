package com.jobseekmed.demo.model;

import com.jobseekmed.demo.model.Enum.ReferralStatus;
import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Referral {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;

    @ManyToOne
    @JoinColumn(name = "referred_by")
    private Employee referredBy;

    @ManyToOne
    @JoinColumn(name = "referred_to")
    private JobSeeker referredTo;

    @Enumerated(EnumType.STRING)
    private ReferralStatus status;

    public void accept() {
        this.status = ReferralStatus.ACCEPTED;
    }

    public void reject() {
        this.status = ReferralStatus.REJECTED;
    }
}
