
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Company in charge of a lodging establishment
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LodgingProperty1", propOrder = {
    "tp",
    "othrTp",
    "prstgsPrprty",
    "nm",
    "id",
    "lctn",
    "assgnr",
    "ctct",
    "ctry",
    "fireSftyActInd"
})
public class LodgingProperty1 {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected LodgingActivity1Code tp;
    @XmlElement(name = "OthrTp")
    protected String othrTp;
    @XmlElement(name = "PrstgsPrprty")
    protected String prstgsPrprty;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Id", required = true)
    protected PartyIdentification197 id;
    @XmlElement(name = "Lctn")
    protected Location3 lctn;
    @XmlElement(name = "Assgnr")
    @XmlSchemaType(name = "string")
    protected CompanyAssigner2Code assgnr;
    @XmlElement(name = "Ctct")
    protected Contact3 ctct;
    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "FireSftyActInd")
    protected Boolean fireSftyActInd;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link LodgingActivity1Code }
     *     
     */
    public LodgingActivity1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LodgingActivity1Code }
     *     
     */
    public LodgingProperty1 setTp(LodgingActivity1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the othrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTp() {
        return othrTp;
    }

    /**
     * Sets the value of the othrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LodgingProperty1 setOthrTp(String value) {
        this.othrTp = value;
        return this;
    }

    /**
     * Gets the value of the prstgsPrprty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrstgsPrprty() {
        return prstgsPrprty;
    }

    /**
     * Sets the value of the prstgsPrprty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LodgingProperty1 setPrstgsPrprty(String value) {
        this.prstgsPrprty = value;
        return this;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LodgingProperty1 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification197 }
     *     
     */
    public PartyIdentification197 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification197 }
     *     
     */
    public LodgingProperty1 setId(PartyIdentification197 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the lctn property.
     * 
     * @return
     *     possible object is
     *     {@link Location3 }
     *     
     */
    public Location3 getLctn() {
        return lctn;
    }

    /**
     * Sets the value of the lctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location3 }
     *     
     */
    public LodgingProperty1 setLctn(Location3 value) {
        this.lctn = value;
        return this;
    }

    /**
     * Gets the value of the assgnr property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyAssigner2Code }
     *     
     */
    public CompanyAssigner2Code getAssgnr() {
        return assgnr;
    }

    /**
     * Sets the value of the assgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyAssigner2Code }
     *     
     */
    public LodgingProperty1 setAssgnr(CompanyAssigner2Code value) {
        this.assgnr = value;
        return this;
    }

    /**
     * Gets the value of the ctct property.
     * 
     * @return
     *     possible object is
     *     {@link Contact3 }
     *     
     */
    public Contact3 getCtct() {
        return ctct;
    }

    /**
     * Sets the value of the ctct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact3 }
     *     
     */
    public LodgingProperty1 setCtct(Contact3 value) {
        this.ctct = value;
        return this;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LodgingProperty1 setCtry(String value) {
        this.ctry = value;
        return this;
    }

    /**
     * Gets the value of the fireSftyActInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFireSftyActInd() {
        return fireSftyActInd;
    }

    /**
     * Sets the value of the fireSftyActInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public LodgingProperty1 setFireSftyActInd(Boolean value) {
        this.fireSftyActInd = value;
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
