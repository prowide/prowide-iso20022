
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Identifies the mandate to be amended and gives details of the new mandate.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandateAmendment1", propOrder = {
    "orgnlMsgInf",
    "amdmntRsn",
    "mndt",
    "orgnlMndt"
})
public class MandateAmendment1 {

    @XmlElement(name = "OrgnlMsgInf")
    protected OriginalMessageInformation1 orgnlMsgInf;
    @XmlElement(name = "AmdmntRsn", required = true)
    protected AmendmentReasonInformation1 amdmntRsn;
    @XmlElement(name = "Mndt", required = true)
    protected MandateInformation3 mndt;
    @XmlElement(name = "OrgnlMndt", required = true)
    protected OriginalMandate1Choice orgnlMndt;

    /**
     * Gets the value of the orgnlMsgInf property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalMessageInformation1 }
     *     
     */
    public OriginalMessageInformation1 getOrgnlMsgInf() {
        return orgnlMsgInf;
    }

    /**
     * Sets the value of the orgnlMsgInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalMessageInformation1 }
     *     
     */
    public MandateAmendment1 setOrgnlMsgInf(OriginalMessageInformation1 value) {
        this.orgnlMsgInf = value;
        return this;
    }

    /**
     * Gets the value of the amdmntRsn property.
     * 
     * @return
     *     possible object is
     *     {@link AmendmentReasonInformation1 }
     *     
     */
    public AmendmentReasonInformation1 getAmdmntRsn() {
        return amdmntRsn;
    }

    /**
     * Sets the value of the amdmntRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmendmentReasonInformation1 }
     *     
     */
    public MandateAmendment1 setAmdmntRsn(AmendmentReasonInformation1 value) {
        this.amdmntRsn = value;
        return this;
    }

    /**
     * Gets the value of the mndt property.
     * 
     * @return
     *     possible object is
     *     {@link MandateInformation3 }
     *     
     */
    public MandateInformation3 getMndt() {
        return mndt;
    }

    /**
     * Sets the value of the mndt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateInformation3 }
     *     
     */
    public MandateAmendment1 setMndt(MandateInformation3 value) {
        this.mndt = value;
        return this;
    }

    /**
     * Gets the value of the orgnlMndt property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalMandate1Choice }
     *     
     */
    public OriginalMandate1Choice getOrgnlMndt() {
        return orgnlMndt;
    }

    /**
     * Sets the value of the orgnlMndt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalMandate1Choice }
     *     
     */
    public MandateAmendment1 setOrgnlMndt(OriginalMandate1Choice value) {
        this.orgnlMndt = value;
        return this;
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

}
