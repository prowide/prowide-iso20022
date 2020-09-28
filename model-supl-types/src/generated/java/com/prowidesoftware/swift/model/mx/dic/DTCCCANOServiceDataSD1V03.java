
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
 * The DTCCCANOServiceDataSD1 message extends ISO corporate action notification (CANO) message with DTCC validation service specific data elements that are not covered by the standard message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTCCCANOServiceDataSD1V03", propOrder = {
    "ntfctnGnlInf",
    "evtsLkg",
    "corpActnNtfctn",
    "undrlygScty",
    "corpActnDtls",
    "corpActnDtDtls",
    "optnDtls",
    "sctiesMvmntDtls",
    "sctiesMvmntSctyDtls",
    "cshMvmntDtls"
})
public class DTCCCANOServiceDataSD1V03 {

    @XmlElement(name = "NtfctnGnlInf")
    protected CorporateActionNotificationSD6 ntfctnGnlInf;
    @XmlElement(name = "EvtsLkg")
    protected List<CorporateActionEventReferenceSD2> evtsLkg;
    @XmlElement(name = "CorpActnNtfctn")
    protected CorporateActionNotificationSD1 corpActnNtfctn;
    @XmlElement(name = "UndrlygScty")
    protected FinancialInstrumentAttributesSD7 undrlygScty;
    @XmlElement(name = "CorpActnDtls")
    protected CorporateActionSD4 corpActnDtls;
    @XmlElement(name = "CorpActnDtDtls")
    protected CorporateActionDateSD4 corpActnDtDtls;
    @XmlElement(name = "OptnDtls")
    protected List<CorporateActionOptionSD5> optnDtls;
    @XmlElement(name = "SctiesMvmntDtls")
    protected List<SecuritiesOptionSD4> sctiesMvmntDtls;
    @XmlElement(name = "SctiesMvmntSctyDtls")
    protected List<FinancialInstrumentAttributesSD5> sctiesMvmntSctyDtls;
    @XmlElement(name = "CshMvmntDtls")
    protected List<CashOptionSD5> cshMvmntDtls;

    /**
     * Gets the value of the ntfctnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNotificationSD6 }
     *     
     */
    public CorporateActionNotificationSD6 getNtfctnGnlInf() {
        return ntfctnGnlInf;
    }

    /**
     * Sets the value of the ntfctnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNotificationSD6 }
     *     
     */
    public DTCCCANOServiceDataSD1V03 setNtfctnGnlInf(CorporateActionNotificationSD6 value) {
        this.ntfctnGnlInf = value;
        return this;
    }

    /**
     * Gets the value of the evtsLkg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evtsLkg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvtsLkg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionEventReferenceSD2 }
     * 
     * 
     */
    public List<CorporateActionEventReferenceSD2> getEvtsLkg() {
        if (evtsLkg == null) {
            evtsLkg = new ArrayList<CorporateActionEventReferenceSD2>();
        }
        return this.evtsLkg;
    }

    /**
     * Gets the value of the corpActnNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNotificationSD1 }
     *     
     */
    public CorporateActionNotificationSD1 getCorpActnNtfctn() {
        return corpActnNtfctn;
    }

    /**
     * Sets the value of the corpActnNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNotificationSD1 }
     *     
     */
    public DTCCCANOServiceDataSD1V03 setCorpActnNtfctn(CorporateActionNotificationSD1 value) {
        this.corpActnNtfctn = value;
        return this;
    }

    /**
     * Gets the value of the undrlygScty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributesSD7 }
     *     
     */
    public FinancialInstrumentAttributesSD7 getUndrlygScty() {
        return undrlygScty;
    }

    /**
     * Sets the value of the undrlygScty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributesSD7 }
     *     
     */
    public DTCCCANOServiceDataSD1V03 setUndrlygScty(FinancialInstrumentAttributesSD7 value) {
        this.undrlygScty = value;
        return this;
    }

    /**
     * Gets the value of the corpActnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionSD4 }
     *     
     */
    public CorporateActionSD4 getCorpActnDtls() {
        return corpActnDtls;
    }

    /**
     * Sets the value of the corpActnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionSD4 }
     *     
     */
    public DTCCCANOServiceDataSD1V03 setCorpActnDtls(CorporateActionSD4 value) {
        this.corpActnDtls = value;
        return this;
    }

    /**
     * Gets the value of the corpActnDtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDateSD4 }
     *     
     */
    public CorporateActionDateSD4 getCorpActnDtDtls() {
        return corpActnDtDtls;
    }

    /**
     * Sets the value of the corpActnDtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDateSD4 }
     *     
     */
    public DTCCCANOServiceDataSD1V03 setCorpActnDtDtls(CorporateActionDateSD4 value) {
        this.corpActnDtDtls = value;
        return this;
    }

    /**
     * Gets the value of the optnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionOptionSD5 }
     * 
     * 
     */
    public List<CorporateActionOptionSD5> getOptnDtls() {
        if (optnDtls == null) {
            optnDtls = new ArrayList<CorporateActionOptionSD5>();
        }
        return this.optnDtls;
    }

    /**
     * Gets the value of the sctiesMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sctiesMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesOptionSD4 }
     * 
     * 
     */
    public List<SecuritiesOptionSD4> getSctiesMvmntDtls() {
        if (sctiesMvmntDtls == null) {
            sctiesMvmntDtls = new ArrayList<SecuritiesOptionSD4>();
        }
        return this.sctiesMvmntDtls;
    }

    /**
     * Gets the value of the sctiesMvmntSctyDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sctiesMvmntSctyDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesMvmntSctyDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrumentAttributesSD5 }
     * 
     * 
     */
    public List<FinancialInstrumentAttributesSD5> getSctiesMvmntSctyDtls() {
        if (sctiesMvmntSctyDtls == null) {
            sctiesMvmntSctyDtls = new ArrayList<FinancialInstrumentAttributesSD5>();
        }
        return this.sctiesMvmntSctyDtls;
    }

    /**
     * Gets the value of the cshMvmntDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cshMvmntDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshMvmntDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashOptionSD5 }
     * 
     * 
     */
    public List<CashOptionSD5> getCshMvmntDtls() {
        if (cshMvmntDtls == null) {
            cshMvmntDtls = new ArrayList<CashOptionSD5>();
        }
        return this.cshMvmntDtls;
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
     * Adds a new item to the evtsLkg list.
     * @see #getEvtsLkg()
     * 
     */
    public DTCCCANOServiceDataSD1V03 addEvtsLkg(CorporateActionEventReferenceSD2 evtsLkg) {
        getEvtsLkg().add(evtsLkg);
        return this;
    }

    /**
     * Adds a new item to the optnDtls list.
     * @see #getOptnDtls()
     * 
     */
    public DTCCCANOServiceDataSD1V03 addOptnDtls(CorporateActionOptionSD5 optnDtls) {
        getOptnDtls().add(optnDtls);
        return this;
    }

    /**
     * Adds a new item to the sctiesMvmntDtls list.
     * @see #getSctiesMvmntDtls()
     * 
     */
    public DTCCCANOServiceDataSD1V03 addSctiesMvmntDtls(SecuritiesOptionSD4 sctiesMvmntDtls) {
        getSctiesMvmntDtls().add(sctiesMvmntDtls);
        return this;
    }

    /**
     * Adds a new item to the sctiesMvmntSctyDtls list.
     * @see #getSctiesMvmntSctyDtls()
     * 
     */
    public DTCCCANOServiceDataSD1V03 addSctiesMvmntSctyDtls(FinancialInstrumentAttributesSD5 sctiesMvmntSctyDtls) {
        getSctiesMvmntSctyDtls().add(sctiesMvmntSctyDtls);
        return this;
    }

    /**
     * Adds a new item to the cshMvmntDtls list.
     * @see #getCshMvmntDtls()
     * 
     */
    public DTCCCANOServiceDataSD1V03 addCshMvmntDtls(CashOptionSD5 cshMvmntDtls) {
        getCshMvmntDtls().add(cshMvmntDtls);
        return this;
    }

}
