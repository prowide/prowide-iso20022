
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
@XmlType(name = "MandateAmendment2", propOrder = {
    "orgnlMsgInf",
    "amdmntRsn",
    "mndt",
    "orgnlMndt"
})
public class MandateAmendment2 {

    @XmlElement(name = "OrgnlMsgInf")
    protected OriginalMessageInformation1 orgnlMsgInf;
    @XmlElement(name = "AmdmntRsn", required = true)
    protected MandateAmendmentReason1 amdmntRsn;
    @XmlElement(name = "Mndt", required = true)
    protected Mandate3 mndt;
    @XmlElement(name = "OrgnlMndt", required = true)
    protected OriginalMandate2Choice orgnlMndt;

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
    public MandateAmendment2 setOrgnlMsgInf(OriginalMessageInformation1 value) {
        this.orgnlMsgInf = value;
        return this;
    }

    /**
     * Gets the value of the amdmntRsn property.
     * 
     * @return
     *     possible object is
     *     {@link MandateAmendmentReason1 }
     *     
     */
    public MandateAmendmentReason1 getAmdmntRsn() {
        return amdmntRsn;
    }

    /**
     * Sets the value of the amdmntRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateAmendmentReason1 }
     *     
     */
    public MandateAmendment2 setAmdmntRsn(MandateAmendmentReason1 value) {
        this.amdmntRsn = value;
        return this;
    }

    /**
     * Gets the value of the mndt property.
     * 
     * @return
     *     possible object is
     *     {@link Mandate3 }
     *     
     */
    public Mandate3 getMndt() {
        return mndt;
    }

    /**
     * Sets the value of the mndt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mandate3 }
     *     
     */
    public MandateAmendment2 setMndt(Mandate3 value) {
        this.mndt = value;
        return this;
    }

    /**
     * Gets the value of the orgnlMndt property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalMandate2Choice }
     *     
     */
    public OriginalMandate2Choice getOrgnlMndt() {
        return orgnlMndt;
    }

    /**
     * Sets the value of the orgnlMndt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalMandate2Choice }
     *     
     */
    public MandateAmendment2 setOrgnlMndt(OriginalMandate2Choice value) {
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
