
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Scope
 * This message is sent by the Creditor sending party to the Debtor receiving party, directly or through agents.
 * It is used to initiate a creditor payment activation request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditorPaymentActivationRequestV01", propOrder = {
    "grpHdr",
    "pmtInf"
})
public class CreditorPaymentActivationRequestV01 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader45 grpHdr;
    @XmlElement(name = "PmtInf", required = true)
    protected List<PaymentInstruction5> pmtInf;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader45 }
     *     
     */
    public GroupHeader45 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader45 }
     *     
     */
    public CreditorPaymentActivationRequestV01 setGrpHdr(GroupHeader45 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the pmtInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentInstruction5 }
     * 
     * 
     */
    public List<PaymentInstruction5> getPmtInf() {
        if (pmtInf == null) {
            pmtInf = new ArrayList<PaymentInstruction5>();
        }
        return this.pmtInf;
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
     * Adds a new item to the pmtInf list.
     * @see #getPmtInf()
     * 
     */
    public CreditorPaymentActivationRequestV01 addPmtInf(PaymentInstruction5 pmtInf) {
        getPmtInf().add(pmtInf);
        return this;
    }

}
