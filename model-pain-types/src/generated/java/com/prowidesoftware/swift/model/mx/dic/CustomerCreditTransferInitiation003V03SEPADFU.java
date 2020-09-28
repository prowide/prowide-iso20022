
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
 * The formats described are formats for payment transactions (DTAUS, pain.00x subsets of the Deutsche Kreditwirtschaft (DK) for SEPA and for submission of same-day urgent credit transfer as well as DTAZV), for downloading customer statement messages (MT940/942, camt.05x) and in-formation pertaining to the securities business as well as formats for the documentary business (documentary credits and guarantees).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerCreditTransferInitiation003V03_SEPA_DFU", propOrder = {
    "grpHdr",
    "pmtInf"
})
public class CustomerCreditTransferInitiation003V03SEPADFU {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeaderSCTDFU1 grpHdr;
    @XmlElement(name = "PmtInf", required = true)
    protected List<PaymentInstructionInformationSCTDFU1> pmtInf;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeaderSCTDFU1 }
     *     
     */
    public GroupHeaderSCTDFU1 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeaderSCTDFU1 }
     *     
     */
    public CustomerCreditTransferInitiation003V03SEPADFU setGrpHdr(GroupHeaderSCTDFU1 value) {
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
     * {@link PaymentInstructionInformationSCTDFU1 }
     * 
     * 
     */
    public List<PaymentInstructionInformationSCTDFU1> getPmtInf() {
        if (pmtInf == null) {
            pmtInf = new ArrayList<PaymentInstructionInformationSCTDFU1>();
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
    public CustomerCreditTransferInitiation003V03SEPADFU addPmtInf(PaymentInstructionInformationSCTDFU1 pmtInf) {
        getPmtInf().add(pmtInf);
        return this;
    }

}
