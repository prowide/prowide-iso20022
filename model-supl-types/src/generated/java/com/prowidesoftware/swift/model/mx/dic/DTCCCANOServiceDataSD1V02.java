
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
 * The DTCCCANOServiceDataSD1 message extends ISO corporate action notification (CANO) message with DTCC validation service specific data elements that are not covered by the standard message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTCCCANOServiceDataSD1V02", propOrder = {
    "ntfctnGnlInfXtnsn",
    "evtsLkgXtnsn",
    "corpActnNtfctnXtnsn",
    "undrlygSctyXtnsn",
    "corpActnDtlsXtnsn",
    "corpActnDtDtlsXtnsn",
    "optnDtlsXtnsn",
    "optnSctiesQtyXtnsn",
    "sctiesMvmntDtlsXtnsn",
    "sctiesMvmntSctyDtlsXtnsn",
    "cshMvmntDtlsXtnsn"
})
public class DTCCCANOServiceDataSD1V02 {

    @XmlElement(name = "NtfctnGnlInfXtnsn")
    protected CorporateActionNotificationSD4 ntfctnGnlInfXtnsn;
    @XmlElement(name = "EvtsLkgXtnsn")
    protected List<CorporateActionEventReferenceSD2> evtsLkgXtnsn;
    @XmlElement(name = "CorpActnNtfctnXtnsn")
    protected CorporateActionNotificationSD1 corpActnNtfctnXtnsn;
    @XmlElement(name = "UndrlygSctyXtnsn")
    protected FinancialInstrumentAttributesSD7 undrlygSctyXtnsn;
    @XmlElement(name = "CorpActnDtlsXtnsn")
    protected CorporateActionSD4 corpActnDtlsXtnsn;
    @XmlElement(name = "CorpActnDtDtlsXtnsn")
    protected CorporateActionDateSD4 corpActnDtDtlsXtnsn;
    @XmlElement(name = "OptnDtlsXtnsn")
    protected List<CorporateActionOptionSD5> optnDtlsXtnsn;
    @XmlElement(name = "OptnSctiesQtyXtnsn")
    protected List<SecuritiesOptionSD1> optnSctiesQtyXtnsn;
    @XmlElement(name = "SctiesMvmntDtlsXtnsn")
    protected List<SecuritiesOptionSD4> sctiesMvmntDtlsXtnsn;
    @XmlElement(name = "SctiesMvmntSctyDtlsXtnsn")
    protected List<FinancialInstrumentAttributesSD5> sctiesMvmntSctyDtlsXtnsn;
    @XmlElement(name = "CshMvmntDtlsXtnsn")
    protected List<CashOptionSD5> cshMvmntDtlsXtnsn;

    /**
     * Gets the value of the ntfctnGnlInfXtnsn property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNotificationSD4 }
     *     
     */
    public CorporateActionNotificationSD4 getNtfctnGnlInfXtnsn() {
        return ntfctnGnlInfXtnsn;
    }

    /**
     * Sets the value of the ntfctnGnlInfXtnsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNotificationSD4 }
     *     
     */
    public DTCCCANOServiceDataSD1V02 setNtfctnGnlInfXtnsn(CorporateActionNotificationSD4 value) {
        this.ntfctnGnlInfXtnsn = value;
        return this;
    }

    /**
     * Gets the value of the evtsLkgXtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evtsLkgXtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvtsLkgXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionEventReferenceSD2 }
     * 
     * 
     */
    public List<CorporateActionEventReferenceSD2> getEvtsLkgXtnsn() {
        if (evtsLkgXtnsn == null) {
            evtsLkgXtnsn = new ArrayList<CorporateActionEventReferenceSD2>();
        }
        return this.evtsLkgXtnsn;
    }

    /**
     * Gets the value of the corpActnNtfctnXtnsn property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNotificationSD1 }
     *     
     */
    public CorporateActionNotificationSD1 getCorpActnNtfctnXtnsn() {
        return corpActnNtfctnXtnsn;
    }

    /**
     * Sets the value of the corpActnNtfctnXtnsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNotificationSD1 }
     *     
     */
    public DTCCCANOServiceDataSD1V02 setCorpActnNtfctnXtnsn(CorporateActionNotificationSD1 value) {
        this.corpActnNtfctnXtnsn = value;
        return this;
    }

    /**
     * Gets the value of the undrlygSctyXtnsn property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributesSD7 }
     *     
     */
    public FinancialInstrumentAttributesSD7 getUndrlygSctyXtnsn() {
        return undrlygSctyXtnsn;
    }

    /**
     * Sets the value of the undrlygSctyXtnsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributesSD7 }
     *     
     */
    public DTCCCANOServiceDataSD1V02 setUndrlygSctyXtnsn(FinancialInstrumentAttributesSD7 value) {
        this.undrlygSctyXtnsn = value;
        return this;
    }

    /**
     * Gets the value of the corpActnDtlsXtnsn property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionSD4 }
     *     
     */
    public CorporateActionSD4 getCorpActnDtlsXtnsn() {
        return corpActnDtlsXtnsn;
    }

    /**
     * Sets the value of the corpActnDtlsXtnsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionSD4 }
     *     
     */
    public DTCCCANOServiceDataSD1V02 setCorpActnDtlsXtnsn(CorporateActionSD4 value) {
        this.corpActnDtlsXtnsn = value;
        return this;
    }

    /**
     * Gets the value of the corpActnDtDtlsXtnsn property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDateSD4 }
     *     
     */
    public CorporateActionDateSD4 getCorpActnDtDtlsXtnsn() {
        return corpActnDtDtlsXtnsn;
    }

    /**
     * Sets the value of the corpActnDtDtlsXtnsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDateSD4 }
     *     
     */
    public DTCCCANOServiceDataSD1V02 setCorpActnDtDtlsXtnsn(CorporateActionDateSD4 value) {
        this.corpActnDtDtlsXtnsn = value;
        return this;
    }

    /**
     * Gets the value of the optnDtlsXtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optnDtlsXtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptnDtlsXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionOptionSD5 }
     * 
     * 
     */
    public List<CorporateActionOptionSD5> getOptnDtlsXtnsn() {
        if (optnDtlsXtnsn == null) {
            optnDtlsXtnsn = new ArrayList<CorporateActionOptionSD5>();
        }
        return this.optnDtlsXtnsn;
    }

    /**
     * Gets the value of the optnSctiesQtyXtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optnSctiesQtyXtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptnSctiesQtyXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesOptionSD1 }
     * 
     * 
     */
    public List<SecuritiesOptionSD1> getOptnSctiesQtyXtnsn() {
        if (optnSctiesQtyXtnsn == null) {
            optnSctiesQtyXtnsn = new ArrayList<SecuritiesOptionSD1>();
        }
        return this.optnSctiesQtyXtnsn;
    }

    /**
     * Gets the value of the sctiesMvmntDtlsXtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sctiesMvmntDtlsXtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesMvmntDtlsXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesOptionSD4 }
     * 
     * 
     */
    public List<SecuritiesOptionSD4> getSctiesMvmntDtlsXtnsn() {
        if (sctiesMvmntDtlsXtnsn == null) {
            sctiesMvmntDtlsXtnsn = new ArrayList<SecuritiesOptionSD4>();
        }
        return this.sctiesMvmntDtlsXtnsn;
    }

    /**
     * Gets the value of the sctiesMvmntSctyDtlsXtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sctiesMvmntSctyDtlsXtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesMvmntSctyDtlsXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrumentAttributesSD5 }
     * 
     * 
     */
    public List<FinancialInstrumentAttributesSD5> getSctiesMvmntSctyDtlsXtnsn() {
        if (sctiesMvmntSctyDtlsXtnsn == null) {
            sctiesMvmntSctyDtlsXtnsn = new ArrayList<FinancialInstrumentAttributesSD5>();
        }
        return this.sctiesMvmntSctyDtlsXtnsn;
    }

    /**
     * Gets the value of the cshMvmntDtlsXtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cshMvmntDtlsXtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshMvmntDtlsXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashOptionSD5 }
     * 
     * 
     */
    public List<CashOptionSD5> getCshMvmntDtlsXtnsn() {
        if (cshMvmntDtlsXtnsn == null) {
            cshMvmntDtlsXtnsn = new ArrayList<CashOptionSD5>();
        }
        return this.cshMvmntDtlsXtnsn;
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
     * Adds a new item to the evtsLkgXtnsn list.
     * @see #getEvtsLkgXtnsn()
     * 
     */
    public DTCCCANOServiceDataSD1V02 addEvtsLkgXtnsn(CorporateActionEventReferenceSD2 evtsLkgXtnsn) {
        getEvtsLkgXtnsn().add(evtsLkgXtnsn);
        return this;
    }

    /**
     * Adds a new item to the optnDtlsXtnsn list.
     * @see #getOptnDtlsXtnsn()
     * 
     */
    public DTCCCANOServiceDataSD1V02 addOptnDtlsXtnsn(CorporateActionOptionSD5 optnDtlsXtnsn) {
        getOptnDtlsXtnsn().add(optnDtlsXtnsn);
        return this;
    }

    /**
     * Adds a new item to the optnSctiesQtyXtnsn list.
     * @see #getOptnSctiesQtyXtnsn()
     * 
     */
    public DTCCCANOServiceDataSD1V02 addOptnSctiesQtyXtnsn(SecuritiesOptionSD1 optnSctiesQtyXtnsn) {
        getOptnSctiesQtyXtnsn().add(optnSctiesQtyXtnsn);
        return this;
    }

    /**
     * Adds a new item to the sctiesMvmntDtlsXtnsn list.
     * @see #getSctiesMvmntDtlsXtnsn()
     * 
     */
    public DTCCCANOServiceDataSD1V02 addSctiesMvmntDtlsXtnsn(SecuritiesOptionSD4 sctiesMvmntDtlsXtnsn) {
        getSctiesMvmntDtlsXtnsn().add(sctiesMvmntDtlsXtnsn);
        return this;
    }

    /**
     * Adds a new item to the sctiesMvmntSctyDtlsXtnsn list.
     * @see #getSctiesMvmntSctyDtlsXtnsn()
     * 
     */
    public DTCCCANOServiceDataSD1V02 addSctiesMvmntSctyDtlsXtnsn(FinancialInstrumentAttributesSD5 sctiesMvmntSctyDtlsXtnsn) {
        getSctiesMvmntSctyDtlsXtnsn().add(sctiesMvmntSctyDtlsXtnsn);
        return this;
    }

    /**
     * Adds a new item to the cshMvmntDtlsXtnsn list.
     * @see #getCshMvmntDtlsXtnsn()
     * 
     */
    public DTCCCANOServiceDataSD1V02 addCshMvmntDtlsXtnsn(CashOptionSD5 cshMvmntDtlsXtnsn) {
        getCshMvmntDtlsXtnsn().add(cshMvmntDtlsXtnsn);
        return this;
    }

}
