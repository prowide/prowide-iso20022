
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
 * Context, or geographic environment, in which trading parties may meet in order to negotiate and execute trades among themselves.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalMarketAnnex2", propOrder = {
    "ctry",
    "lclOrdrDsk",
    "sbcptPrcgChrtcs",
    "redPrcgChrtcs",
    "sttlmDtls"
})
public class LocalMarketAnnex2 {

    @XmlElement(name = "Ctry", required = true)
    protected List<String> ctry;
    @XmlElement(name = "LclOrdrDsk", required = true)
    protected ContactAttributes1 lclOrdrDsk;
    @XmlElement(name = "SbcptPrcgChrtcs", required = true)
    protected ProcessingCharacteristics2 sbcptPrcgChrtcs;
    @XmlElement(name = "RedPrcgChrtcs", required = true)
    protected ProcessingCharacteristics3 redPrcgChrtcs;
    @XmlElement(name = "SttlmDtls", required = true)
    protected List<CashAccount22> sttlmDtls;

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
     *     {@link ContactAttributes1 }
     *     
     */
    public ContactAttributes1 getLclOrdrDsk() {
        return lclOrdrDsk;
    }

    /**
     * Sets the value of the lclOrdrDsk property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAttributes1 }
     *     
     */
    public LocalMarketAnnex2 setLclOrdrDsk(ContactAttributes1 value) {
        this.lclOrdrDsk = value;
        return this;
    }

    /**
     * Gets the value of the sbcptPrcgChrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingCharacteristics2 }
     *     
     */
    public ProcessingCharacteristics2 getSbcptPrcgChrtcs() {
        return sbcptPrcgChrtcs;
    }

    /**
     * Sets the value of the sbcptPrcgChrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingCharacteristics2 }
     *     
     */
    public LocalMarketAnnex2 setSbcptPrcgChrtcs(ProcessingCharacteristics2 value) {
        this.sbcptPrcgChrtcs = value;
        return this;
    }

    /**
     * Gets the value of the redPrcgChrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingCharacteristics3 }
     *     
     */
    public ProcessingCharacteristics3 getRedPrcgChrtcs() {
        return redPrcgChrtcs;
    }

    /**
     * Sets the value of the redPrcgChrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingCharacteristics3 }
     *     
     */
    public LocalMarketAnnex2 setRedPrcgChrtcs(ProcessingCharacteristics3 value) {
        this.redPrcgChrtcs = value;
        return this;
    }

    /**
     * Gets the value of the sttlmDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sttlmDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttlmDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashAccount22 }
     * 
     * 
     */
    public List<CashAccount22> getSttlmDtls() {
        if (sttlmDtls == null) {
            sttlmDtls = new ArrayList<CashAccount22>();
        }
        return this.sttlmDtls;
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
    public LocalMarketAnnex2 addCtry(String ctry) {
        getCtry().add(ctry);
        return this;
    }

    /**
     * Adds a new item to the sttlmDtls list.
     * @see #getSttlmDtls()
     * 
     */
    public LocalMarketAnnex2 addSttlmDtls(CashAccount22 sttlmDtls) {
        getSttlmDtls().add(sttlmDtls);
        return this;
    }

}
