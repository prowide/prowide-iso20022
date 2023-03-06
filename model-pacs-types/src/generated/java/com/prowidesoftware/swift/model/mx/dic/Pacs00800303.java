
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
 * The FI2FICustomerCreditTransfer.EPCCoreAOSV03 message provides the implementation of the Core+AOS Technical Validation Subset of the ISO 20022 message reflecting the EPC Implementation Guidelines v3.x, as approved on 30 June 2008 by the OITS Plenary.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pacs.008.003.03", propOrder = {
    "grpHdr",
    "cdtTrfTxInf"
})
public class Pacs00800303 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader26 grpHdr;
    @XmlElement(name = "CdtTrfTxInf", required = true)
    protected List<CreditTransferTransactionInformation9> cdtTrfTxInf;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader26 }
     *     
     */
    public GroupHeader26 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader26 }
     *     
     */
    public Pacs00800303 setGrpHdr(GroupHeader26 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the cdtTrfTxInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cdtTrfTxInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCdtTrfTxInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditTransferTransactionInformation9 }
     * 
     * 
     */
    public List<CreditTransferTransactionInformation9> getCdtTrfTxInf() {
        if (cdtTrfTxInf == null) {
            cdtTrfTxInf = new ArrayList<CreditTransferTransactionInformation9>();
        }
        return this.cdtTrfTxInf;
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
     * Adds a new item to the cdtTrfTxInf list.
     * @see #getCdtTrfTxInf()
     * 
     */
    public Pacs00800303 addCdtTrfTxInf(CreditTransferTransactionInformation9 cdtTrfTxInf) {
        getCdtTrfTxInf().add(cdtTrfTxInf);
        return this;
    }

}
