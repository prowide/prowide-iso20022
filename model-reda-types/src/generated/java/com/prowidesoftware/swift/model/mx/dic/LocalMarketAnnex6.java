
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
 * Context, or geographic environment, in which trading parties may meet in order to negotiate and execute trades among themselves.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalMarketAnnex6", propOrder = {
    "ctry",
    "lclOrdrDsk",
    "sbcptPrcgChrtcs",
    "redPrcgChrtcs",
    "swtchPrcgChrtcs",
    "cshSttlmDtls",
    "addtlInf"
})
public class LocalMarketAnnex6 {

    @XmlElement(name = "Ctry", required = true)
    protected List<String> ctry;
    @XmlElement(name = "LclOrdrDsk", required = true)
    protected OrderDesk1 lclOrdrDsk;
    @XmlElement(name = "SbcptPrcgChrtcs")
    protected ProcessingCharacteristics11 sbcptPrcgChrtcs;
    @XmlElement(name = "RedPrcgChrtcs")
    protected ProcessingCharacteristics10 redPrcgChrtcs;
    @XmlElement(name = "SwtchPrcgChrtcs")
    protected ProcessingCharacteristics9 swtchPrcgChrtcs;
    @XmlElement(name = "CshSttlmDtls")
    protected List<CashAccount205> cshSttlmDtls;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the ctry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ctry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCtry() {
        if (ctry == null) {
            ctry = new ArrayList<String>();
        }
        return this.ctry;
    }

    /**
     * Gets the value of the lclOrdrDsk property.
     * 
     * @return
     *     possible object is
     *     {@link OrderDesk1 }
     *     
     */
    public OrderDesk1 getLclOrdrDsk() {
        return lclOrdrDsk;
    }

    /**
     * Sets the value of the lclOrdrDsk property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderDesk1 }
     *     
     */
    public LocalMarketAnnex6 setLclOrdrDsk(OrderDesk1 value) {
        this.lclOrdrDsk = value;
        return this;
    }

    /**
     * Gets the value of the sbcptPrcgChrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingCharacteristics11 }
     *     
     */
    public ProcessingCharacteristics11 getSbcptPrcgChrtcs() {
        return sbcptPrcgChrtcs;
    }

    /**
     * Sets the value of the sbcptPrcgChrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingCharacteristics11 }
     *     
     */
    public LocalMarketAnnex6 setSbcptPrcgChrtcs(ProcessingCharacteristics11 value) {
        this.sbcptPrcgChrtcs = value;
        return this;
    }

    /**
     * Gets the value of the redPrcgChrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingCharacteristics10 }
     *     
     */
    public ProcessingCharacteristics10 getRedPrcgChrtcs() {
        return redPrcgChrtcs;
    }

    /**
     * Sets the value of the redPrcgChrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingCharacteristics10 }
     *     
     */
    public LocalMarketAnnex6 setRedPrcgChrtcs(ProcessingCharacteristics10 value) {
        this.redPrcgChrtcs = value;
        return this;
    }

    /**
     * Gets the value of the swtchPrcgChrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingCharacteristics9 }
     *     
     */
    public ProcessingCharacteristics9 getSwtchPrcgChrtcs() {
        return swtchPrcgChrtcs;
    }

    /**
     * Sets the value of the swtchPrcgChrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingCharacteristics9 }
     *     
     */
    public LocalMarketAnnex6 setSwtchPrcgChrtcs(ProcessingCharacteristics9 value) {
        this.swtchPrcgChrtcs = value;
        return this;
    }

    /**
     * Gets the value of the cshSttlmDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cshSttlmDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshSttlmDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashAccount205 }
     * 
     * 
     */
    public List<CashAccount205> getCshSttlmDtls() {
        if (cshSttlmDtls == null) {
            cshSttlmDtls = new ArrayList<CashAccount205>();
        }
        return this.cshSttlmDtls;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation15 }
     * 
     * 
     */
    public List<AdditionalInformation15> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<AdditionalInformation15>();
        }
        return this.addtlInf;
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
     * Adds a new item to the ctry list.
     * @see #getCtry()
     * 
     */
    public LocalMarketAnnex6 addCtry(String ctry) {
        getCtry().add(ctry);
        return this;
    }

    /**
     * Adds a new item to the cshSttlmDtls list.
     * @see #getCshSttlmDtls()
     * 
     */
    public LocalMarketAnnex6 addCshSttlmDtls(CashAccount205 cshSttlmDtls) {
        getCshSttlmDtls().add(cshSttlmDtls);
        return this;
    }

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public LocalMarketAnnex6 addAddtlInf(AdditionalInformation15 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
