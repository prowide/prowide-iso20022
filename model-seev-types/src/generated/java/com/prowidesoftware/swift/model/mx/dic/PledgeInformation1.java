
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information about the pledge and pledger.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PledgeInformation1", propOrder = {
    "pldgr",
    "thrdPty",
    "pldgTp",
    "rtrSctiesInd"
})
public class PledgeInformation1 {

    @XmlElement(name = "Pldgr", required = true)
    protected PartyIdentification232Choice pldgr;
    @XmlElement(name = "ThrdPty")
    protected ThirdPartyIdentification1 thrdPty;
    @XmlElement(name = "PldgTp", required = true)
    protected GenericIdentification36 pldgTp;
    @XmlElement(name = "RtrSctiesInd")
    protected Boolean rtrSctiesInd;

    /**
     * Gets the value of the pldgr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification232Choice }
     *     
     */
    public PartyIdentification232Choice getPldgr() {
        return pldgr;
    }

    /**
     * Sets the value of the pldgr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification232Choice }
     *     
     */
    public PledgeInformation1 setPldgr(PartyIdentification232Choice value) {
        this.pldgr = value;
        return this;
    }

    /**
     * Gets the value of the thrdPty property.
     * 
     * @return
     *     possible object is
     *     {@link ThirdPartyIdentification1 }
     *     
     */
    public ThirdPartyIdentification1 getThrdPty() {
        return thrdPty;
    }

    /**
     * Sets the value of the thrdPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThirdPartyIdentification1 }
     *     
     */
    public PledgeInformation1 setThrdPty(ThirdPartyIdentification1 value) {
        this.thrdPty = value;
        return this;
    }

    /**
     * Gets the value of the pldgTp property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification36 }
     *     
     */
    public GenericIdentification36 getPldgTp() {
        return pldgTp;
    }

    /**
     * Sets the value of the pldgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification36 }
     *     
     */
    public PledgeInformation1 setPldgTp(GenericIdentification36 value) {
        this.pldgTp = value;
        return this;
    }

    /**
     * Gets the value of the rtrSctiesInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRtrSctiesInd() {
        return rtrSctiesInd;
    }

    /**
     * Sets the value of the rtrSctiesInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PledgeInformation1 setRtrSctiesInd(Boolean value) {
        this.rtrSctiesInd = value;
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
