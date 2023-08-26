package com.example.furamaresortmanagementapp.model.contract;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int contractDetailId;

    @NotNull(message = "Số lượng không được để trống")
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "attach_service_id")
    private AttachService attachService ;

    @ManyToOne
    @JoinColumn(name = "contract_id")
    private Contract contract;

    public ContractDetail() {
    }

    public ContractDetail(int contractDetailId, int quantity, AttachService attachService, Contract contract) {
        this.contractDetailId = contractDetailId;
        this.quantity = quantity;
        this.attachService = attachService;
        this.contract = contract;
    }

    public int getContractDetailId() {
        return contractDetailId;
    }

    public void setContractDetailId(int contractDetailId) {
        this.contractDetailId = contractDetailId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public AttachService getAttachService() {
        return attachService;
    }

    public void setAttachService(AttachService attachService) {
        this.attachService = attachService;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }
}
