package com.jobseekmed.demo.model;

import com.jobseekmed.demo.model.Enum.ReferralStatus;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Referral {
    private Long id;
    private Job job;
    private Employee referredBy;
    private JobSeeker referredTo;
    private ReferralStatus status;

    public void accept() {
        this.status = ReferralStatus.ACCEPTED;
    }

    public void reject() {
        this.status = ReferralStatus.REJECTED;
    }
}
