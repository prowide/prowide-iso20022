
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
@XmlType(name = "HiredVehicle3", propOrder = {
    "cpnyTp",
    "cpnyNm",
    "tpOfVhcl",
    "vhclId",
    "drvrId",
    "drvrTaxId",
    "dstnNmAndLctn",
    "dstnAdr"
})
public class HiredVehicle3 {

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
    @XmlElement(name = "DstnNmAndLctn")
    protected String dstnNmAndLctn;
    @XmlElement(name = "DstnAdr")
    protected Address2 dstnAdr;

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
    public HiredVehicle3 setCpnyTp(String value) {
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
    public HiredVehicle3 setCpnyNm(String value) {
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
    public HiredVehicle3 setTpOfVhcl(String value) {
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
    public HiredVehicle3 setVhclId(String value) {
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
    public HiredVehicle3 setDrvrId(String value) {
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
    public HiredVehicle3 setDrvrTaxId(String value) {
        this.drvrTaxId = value;
        return this;
    }

    /**
     * Gets the value of the dstnNmAndLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDstnNmAndLctn() {
        return dstnNmAndLctn;
    }

    /**
     * Sets the value of the dstnNmAndLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public HiredVehicle3 setDstnNmAndLctn(String value) {
        this.dstnNmAndLctn = value;
        return this;
    }

    /**
     * Gets the value of the dstnAdr property.
     * 
     * @return
     *     possible object is
     *     {@link Address2 }
     *     
     */
    public Address2 getDstnAdr() {
        return dstnAdr;
    }

    /**
     * Sets the value of the dstnAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address2 }
     *     
     */
    public HiredVehicle3 setDstnAdr(Address2 value) {
        this.dstnAdr = value;
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
