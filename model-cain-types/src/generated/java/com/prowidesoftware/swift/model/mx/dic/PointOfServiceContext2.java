
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * Context of the transaction at the point of service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfServiceContext2", propOrder = {
    "cardPres",
    "crdhldrPres",
    "crdhldrActvtd",
    "trnspndrInittd",
    "attnddInd",
    "uattnddLvlCtgy",
    "eComrcInd",
    "eComrcData",
    "motoInd",
    "prtlApprvlSpprtd",
    "delydAuthstnInd",
    "sctyChrtcs",
    "othrSctyChrtcs",
    "cardDataNtryMd",
    "othrCardDataNtryMd",
    "storgLctn",
    "spclConds"
})
public class PointOfServiceContext2 {

    @XmlElement(name = "CardPres")
    protected Boolean cardPres;
    @XmlElement(name = "CrdhldrPres")
    protected Boolean crdhldrPres;
    @XmlElement(name = "CrdhldrActvtd")
    protected Boolean crdhldrActvtd;
    @XmlElement(name = "TrnspndrInittd")
    protected Boolean trnspndrInittd;
    @XmlElement(name = "AttnddInd")
    protected Boolean attnddInd;
    @XmlElement(name = "UattnddLvlCtgy")
    protected String uattnddLvlCtgy;
    @XmlElement(name = "EComrcInd")
    protected Boolean eComrcInd;
    @XmlElement(name = "EComrcData")
    protected List<ECommerceData1> eComrcData;
    @XmlElement(name = "MOTOInd")
    protected Boolean motoInd;
    @XmlElement(name = "PrtlApprvlSpprtd")
    protected Boolean prtlApprvlSpprtd;
    @XmlElement(name = "DelydAuthstnInd")
    protected Boolean delydAuthstnInd;
    @XmlElement(name = "SctyChrtcs")
    @XmlSchemaType(name = "string")
    protected List<SecurityCharacteristics1Code> sctyChrtcs;
    @XmlElement(name = "OthrSctyChrtcs")
    protected String othrSctyChrtcs;
    @XmlElement(name = "CardDataNtryMd")
    @XmlSchemaType(name = "string")
    protected CardDataReading7Code cardDataNtryMd;
    @XmlElement(name = "OthrCardDataNtryMd")
    protected String othrCardDataNtryMd;
    @XmlElement(name = "StorgLctn")
    protected String storgLctn;
    @XmlElement(name = "SpclConds")
    protected List<SpecialConditions1> spclConds;

    /**
     * Gets the value of the cardPres property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCardPres() {
        return cardPres;
    }

    /**
     * Sets the value of the cardPres property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PointOfServiceContext2 setCardPres(Boolean value) {
        this.cardPres = value;
        return this;
    }

    /**
     * Gets the value of the crdhldrPres property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrdhldrPres() {
        return crdhldrPres;
    }

    /**
     * Sets the value of the crdhldrPres property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PointOfServiceContext2 setCrdhldrPres(Boolean value) {
        this.crdhldrPres = value;
        return this;
    }

    /**
     * Gets the value of the crdhldrActvtd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrdhldrActvtd() {
        return crdhldrActvtd;
    }

    /**
     * Sets the value of the crdhldrActvtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PointOfServiceContext2 setCrdhldrActvtd(Boolean value) {
        this.crdhldrActvtd = value;
        return this;
    }

    /**
     * Gets the value of the trnspndrInittd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrnspndrInittd() {
        return trnspndrInittd;
    }

    /**
     * Sets the value of the trnspndrInittd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PointOfServiceContext2 setTrnspndrInittd(Boolean value) {
        this.trnspndrInittd = value;
        return this;
    }

    /**
     * Gets the value of the attnddInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAttnddInd() {
        return attnddInd;
    }

    /**
     * Sets the value of the attnddInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PointOfServiceContext2 setAttnddInd(Boolean value) {
        this.attnddInd = value;
        return this;
    }

    /**
     * Gets the value of the uattnddLvlCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUattnddLvlCtgy() {
        return uattnddLvlCtgy;
    }

    /**
     * Sets the value of the uattnddLvlCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PointOfServiceContext2 setUattnddLvlCtgy(String value) {
        this.uattnddLvlCtgy = value;
        return this;
    }

    /**
     * Gets the value of the eComrcInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEComrcInd() {
        return eComrcInd;
    }

    /**
     * Sets the value of the eComrcInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PointOfServiceContext2 setEComrcInd(Boolean value) {
        this.eComrcInd = value;
        return this;
    }

    /**
     * Gets the value of the eComrcData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eComrcData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEComrcData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ECommerceData1 }
     * 
     * 
     */
    public List<ECommerceData1> getEComrcData() {
        if (eComrcData == null) {
            eComrcData = new ArrayList<ECommerceData1>();
        }
        return this.eComrcData;
    }

    /**
     * Gets the value of the motoInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMOTOInd() {
        return motoInd;
    }

    /**
     * Sets the value of the motoInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PointOfServiceContext2 setMOTOInd(Boolean value) {
        this.motoInd = value;
        return this;
    }

    /**
     * Gets the value of the prtlApprvlSpprtd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrtlApprvlSpprtd() {
        return prtlApprvlSpprtd;
    }

    /**
     * Sets the value of the prtlApprvlSpprtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PointOfServiceContext2 setPrtlApprvlSpprtd(Boolean value) {
        this.prtlApprvlSpprtd = value;
        return this;
    }

    /**
     * Gets the value of the delydAuthstnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelydAuthstnInd() {
        return delydAuthstnInd;
    }

    /**
     * Sets the value of the delydAuthstnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PointOfServiceContext2 setDelydAuthstnInd(Boolean value) {
        this.delydAuthstnInd = value;
        return this;
    }

    /**
     * Gets the value of the sctyChrtcs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sctyChrtcs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctyChrtcs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityCharacteristics1Code }
     * 
     * 
     */
    public List<SecurityCharacteristics1Code> getSctyChrtcs() {
        if (sctyChrtcs == null) {
            sctyChrtcs = new ArrayList<SecurityCharacteristics1Code>();
        }
        return this.sctyChrtcs;
    }

    /**
     * Gets the value of the othrSctyChrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrSctyChrtcs() {
        return othrSctyChrtcs;
    }

    /**
     * Sets the value of the othrSctyChrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PointOfServiceContext2 setOthrSctyChrtcs(String value) {
        this.othrSctyChrtcs = value;
        return this;
    }

    /**
     * Gets the value of the cardDataNtryMd property.
     * 
     * @return
     *     possible object is
     *     {@link CardDataReading7Code }
     *     
     */
    public CardDataReading7Code getCardDataNtryMd() {
        return cardDataNtryMd;
    }

    /**
     * Sets the value of the cardDataNtryMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDataReading7Code }
     *     
     */
    public PointOfServiceContext2 setCardDataNtryMd(CardDataReading7Code value) {
        this.cardDataNtryMd = value;
        return this;
    }

    /**
     * Gets the value of the othrCardDataNtryMd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrCardDataNtryMd() {
        return othrCardDataNtryMd;
    }

    /**
     * Sets the value of the othrCardDataNtryMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PointOfServiceContext2 setOthrCardDataNtryMd(String value) {
        this.othrCardDataNtryMd = value;
        return this;
    }

    /**
     * Gets the value of the storgLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorgLctn() {
        return storgLctn;
    }

    /**
     * Sets the value of the storgLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PointOfServiceContext2 setStorgLctn(String value) {
        this.storgLctn = value;
        return this;
    }

    /**
     * Gets the value of the spclConds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spclConds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpclConds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialConditions1 }
     * 
     * 
     */
    public List<SpecialConditions1> getSpclConds() {
        if (spclConds == null) {
            spclConds = new ArrayList<SpecialConditions1>();
        }
        return this.spclConds;
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
     * Adds a new item to the eComrcData list.
     * @see #getEComrcData()
     * 
     */
    public PointOfServiceContext2 addEComrcData(ECommerceData1 eComrcData) {
        getEComrcData().add(eComrcData);
        return this;
    }

    /**
     * Adds a new item to the sctyChrtcs list.
     * @see #getSctyChrtcs()
     * 
     */
    public PointOfServiceContext2 addSctyChrtcs(SecurityCharacteristics1Code sctyChrtcs) {
        getSctyChrtcs().add(sctyChrtcs);
        return this;
    }

    /**
     * Adds a new item to the spclConds list.
     * @see #getSpclConds()
     * 
     */
    public PointOfServiceContext2 addSpclConds(SpecialConditions1 spclConds) {
        getSpclConds().add(spclConds);
        return this;
    }

}
