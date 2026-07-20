
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
 * Information regarding the selected buyer protection instructions options.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionOptionStatement1", propOrder = {
    "optnNb",
    "optnTp",
    "buyrPrtcnInstrDtls"
})
public class CorporateActionOptionStatement1 {

    @XmlElement(name = "OptnNb", required = true)
    protected String optnNb;
    @XmlElement(name = "OptnTp", required = true)
    protected CorporateActionOption47Choice optnTp;
    @XmlElement(name = "BuyrPrtcnInstrDtls", required = true)
    protected List<BuyerProtectionInstructionDetails1> buyrPrtcnInstrDtls;

    /**
     * Gets the value of the optnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptnNb() {
        return optnNb;
    }

    /**
     * Sets the value of the optnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionOptionStatement1 setOptnNb(String value) {
        this.optnNb = value;
        return this;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption47Choice }
     *     
     */
    public CorporateActionOption47Choice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption47Choice }
     *     
     */
    public CorporateActionOptionStatement1 setOptnTp(CorporateActionOption47Choice value) {
        this.optnTp = value;
        return this;
    }

    /**
     * Gets the value of the buyrPrtcnInstrDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the buyrPrtcnInstrDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyrPrtcnInstrDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BuyerProtectionInstructionDetails1 }
     * 
     * 
     * @return
     *     The value of the buyrPrtcnInstrDtls property.
     */
    public List<BuyerProtectionInstructionDetails1> getBuyrPrtcnInstrDtls() {
        if (buyrPrtcnInstrDtls == null) {
            buyrPrtcnInstrDtls = new ArrayList<>();
        }
        return this.buyrPrtcnInstrDtls;
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
     * Adds a new item to the buyrPrtcnInstrDtls list.
     * @see #getBuyrPrtcnInstrDtls()
     * 
     */
    public CorporateActionOptionStatement1 addBuyrPrtcnInstrDtls(BuyerProtectionInstructionDetails1 buyrPrtcnInstrDtls) {
        getBuyrPrtcnInstrDtls().add(buyrPrtcnInstrDtls);
        return this;
    }

}
