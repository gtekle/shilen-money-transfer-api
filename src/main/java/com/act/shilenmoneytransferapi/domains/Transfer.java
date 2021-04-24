package com.act.shilenmoneytransferapi.domains;

import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Transfer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private Date transferDate;

    @Column(nullable = true)
    private String reasonForTransfer;

    @Column(nullable = false, unique = true)
    private Double transferAmount=0.0;

    private String status;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "accountId", nullable = true, columnDefinition = "bigint")
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    private Account senderAccount;

    @ManyToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "accountId", nullable = true, columnDefinition = "bigint")
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    private Account receiverAccount;

}
