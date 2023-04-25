
package com.prowidesoftware.swift.model.mx.dic;

import java.util.Calendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details about a member of a loyalty programme.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyMember2", propOrder = {
    "nm",
    "adr",
    "id",
    "mmbSts",
    "xprtnDt",
    "lltyVal",
    "lltyValTp",
    "othrLltyValTp",
    "valToCdt",
    "valToDbt",
    "bal"
})
public class LoyaltyMember2 {

    @XmlElement(name = "Nm")
    protected CardholderName3 nm;
    @XmlElement(name = "Adr")
    protected Address2 adr;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "MmbSts")
    protected String mmbSts;
    @XmlElement(name = "XprtnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar xprtnDt;
    @XmlElement(name = "LltyVal")
    protected String lltyVal;
    @XmlElement(name = "LltyValTp")
    @XmlSchemaType(name = "string")
    protected LoyaltyValueType1Code lltyValTp;
    @XmlElement(name = "OthrLltyValTp")
    protected String othrLltyValTp;
    @XmlElement(name = "ValToCdt")
    protected String valToCdt;
    @XmlElement(name = "ValToDbt")
    protected String valToDbt;
    @XmlElement(name = "Bal")
    protected String bal;

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link CardholderName3 }
     *     
     */
    public CardholderName3 getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardholderName3 }
     *     
     */
    public LoyaltyMember2 setNm(CardholderName3 value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link Address2 }
     *     
     */
    public Address2 getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address2 }
     *     
     */
    public LoyaltyMember2 setAdr(Address2 value) {
        this.adr = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoyaltyMember2 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the mmbSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMmbSts() {
        return mmbSts;
    }

    /**
     * Sets the value of the mmbSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoyaltyMember2 setMmbSts(String value) {
        this.mmbSts = value;
        return this;
    }

    /**
     * Gets the value of the xprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getXprtnDt() {
        return xprtnDt;
    }

    /**
     * Sets the value of the xprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoyaltyMember2 setXprtnDt(Calendar value) {
        this.xprtnDt = value;
        return this;
    }

    /**
     * Gets the value of the lltyVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLltyVal() {
        return lltyVal;
    }

    /**
     * Sets the value of the lltyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoyaltyMember2 setLltyVal(String value) {
        this.lltyVal = value;
        return this;
    }

    /**
     * Gets the value of the lltyValTp property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyValueType1Code }
     *     
     */
    public LoyaltyValueType1Code getLltyValTp() {
        return lltyValTp;
    }

    /**
     * Sets the value of the lltyValTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyValueType1Code }
     *     
     */
    public LoyaltyMember2 setLltyValTp(LoyaltyValueType1Code value) {
        this.lltyValTp = value;
        return this;
    }

    /**
     * Gets the value of the othrLltyValTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrLltyValTp() {
        return othrLltyValTp;
    }

    /**
     * Sets the value of the othrLltyValTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoyaltyMember2 setOthrLltyValTp(String value) {
        this.othrLltyValTp = value;
        return this;
    }

    /**
     * Gets the value of the valToCdt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValToCdt() {
        return valToCdt;
    }

    /**
     * Sets the value of the valToCdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoyaltyMember2 setValToCdt(String value) {
        this.valToCdt = value;
        return this;
    }

    /**
     * Gets the value of the valToDbt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValToDbt() {
        return valToDbt;
    }

    /**
     * Sets the value of the valToDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoyaltyMember2 setValToDbt(String value) {
        this.valToDbt = value;
        return this;
    }

    /**
     * Gets the value of the bal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBal() {
        return bal;
    }

    /**
     * Sets the value of the bal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoyaltyMember2 setBal(String value) {
        this.bal = value;
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
