
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Clearing instructions transactions list.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingInstructions1", propOrder = {
    "fiToFICdtTrfTxInf",
    "fiToFIDrctDbtTxInf"
})
public class ClearingInstructions1 {

    @XmlElement(name = "FIToFICdtTrfTxInf", required = true)
    protected List<FIToFICreditTransferTransactionInformationDetails1> fiToFICdtTrfTxInf;
    @XmlElement(name = "FIToFIDrctDbtTxInf", required = true)
    protected List<FIToFIDirectDebitTransactionInformationDetails1> fiToFIDrctDbtTxInf;

    /**
     * Gets the value of the fiToFICdtTrfTxInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fiToFICdtTrfTxInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFIToFICdtTrfTxInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FIToFICreditTransferTransactionInformationDetails1 }
     * 
     * 
     * @return
     *     The value of the fiToFICdtTrfTxInf property.
     */
    public List<FIToFICreditTransferTransactionInformationDetails1> getFIToFICdtTrfTxInf() {
        if (fiToFICdtTrfTxInf == null) {
            fiToFICdtTrfTxInf = new ArrayList<>();
        }
        return this.fiToFICdtTrfTxInf;
    }

    /**
     * Gets the value of the fiToFIDrctDbtTxInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fiToFIDrctDbtTxInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFIToFIDrctDbtTxInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FIToFIDirectDebitTransactionInformationDetails1 }
     * 
     * 
     * @return
     *     The value of the fiToFIDrctDbtTxInf property.
     */
    public List<FIToFIDirectDebitTransactionInformationDetails1> getFIToFIDrctDbtTxInf() {
        if (fiToFIDrctDbtTxInf == null) {
            fiToFIDrctDbtTxInf = new ArrayList<>();
        }
        return this.fiToFIDrctDbtTxInf;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * Adds a new item to the fIToFICdtTrfTxInf list.
     * @see #getFIToFICdtTrfTxInf()
     * 
     */
    public ClearingInstructions1 addFIToFICdtTrfTxInf(FIToFICreditTransferTransactionInformationDetails1 fIToFICdtTrfTxInf) {
        getFIToFICdtTrfTxInf().add(fIToFICdtTrfTxInf);
        return this;
    }

    /**
     * Adds a new item to the fIToFIDrctDbtTxInf list.
     * @see #getFIToFIDrctDbtTxInf()
     * 
     */
    public ClearingInstructions1 addFIToFIDrctDbtTxInf(FIToFIDirectDebitTransactionInformationDetails1 fIToFIDrctDbtTxInf) {
        getFIToFIDrctDbtTxInf().add(fIToFIDrctDbtTxInf);
        return this;
    }

}
