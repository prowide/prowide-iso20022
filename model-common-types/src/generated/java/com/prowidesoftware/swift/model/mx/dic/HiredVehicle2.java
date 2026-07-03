
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
 * Vehicle for hire for passenger transport - excludes vehicles driven by a renter.  Examples include, but are not limited to, taxi, chauffeured limousine, boats.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HiredVehicle2", propOrder = {
    "cpnyTp",
    "cpnyNm",
    "tpOfVhcl",
    "vhclId",
    "drvrId",
    "drvrTaxId",
    "dstn"
})
public class HiredVehicle2 {

    @XmlElement(name = "CpnyTp")
    protected String cpnyTp;
    @XmlElement(name = "CpnyNm")
    protected String cpnyNm;
    @XmlElement(name = "TpOfVhcl")
    protected String tpOfVhcl;
    @XmlElement(name = "VhclId")
    protected String vhclId;
    @XmlElement(name = "DrvrId")
    protected String drvrId;
    @XmlElement(name = "DrvrTaxId")
    protected String drvrTaxId;
    @XmlElement(name = "Dstn")
    protected Destination3 dstn;

    /**
     * Gets the value of the cpnyTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnyTp() {
        return cpnyTp;
    }

    /**
     * Sets the value of the cpnyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public HiredVehicle2 setCpnyTp(String value) {
        this.cpnyTp = value;
        return this;
    }

    /**
     * Gets the value of the cpnyNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnyNm() {
        return cpnyNm;
    }

    /**
     * Sets the value of the cpnyNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public HiredVehicle2 setCpnyNm(String value) {
        this.cpnyNm = value;
        return this;
    }

    /**
     * Gets the value of the tpOfVhcl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpOfVhcl() {
        return tpOfVhcl;
    }

    /**
     * Sets the value of the tpOfVhcl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public HiredVehicle2 setTpOfVhcl(String value) {
        this.tpOfVhcl = value;
        return this;
    }

    /**
     * Gets the value of the vhclId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVhclId() {
        return vhclId;
    }

    /**
     * Sets the value of the vhclId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public HiredVehicle2 setVhclId(String value) {
        this.vhclId = value;
        return this;
    }

    /**
     * Gets the value of the drvrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrvrId() {
        return drvrId;
    }

    /**
     * Sets the value of the drvrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public HiredVehicle2 setDrvrId(String value) {
        this.drvrId = value;
        return this;
    }

    /**
     * Gets the value of the drvrTaxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrvrTaxId() {
        return drvrTaxId;
    }

    /**
     * Sets the value of the drvrTaxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public HiredVehicle2 setDrvrTaxId(String value) {
        this.drvrTaxId = value;
        return this;
    }

    /**
     * Gets the value of the dstn property.
     * 
     * @return
     *     possible object is
     *     {@link Destination3 }
     *     
     */
    public Destination3 getDstn() {
        return dstn;
    }

    /**
     * Sets the value of the dstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Destination3 }
     *     
     */
    public HiredVehicle2 setDstn(Destination3 value) {
        this.dstn = value;
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
