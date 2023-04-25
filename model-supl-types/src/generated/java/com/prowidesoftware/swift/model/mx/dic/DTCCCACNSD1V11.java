
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
 * The DTCCCACNSD1 message extends ISO corporate action cancellation advice (CACN) message with DTCC corporate action elements not covered in the standard message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTCCCACNSD1V11", propOrder = {
    "pgntn",
    "ntfctn",
    "gnlInf",
    "undrlygScty",
    "evtsLkg",
    "xtrnlCmnts"
})
public class DTCCCACNSD1V11 {

    @XmlElement(name = "Pgntn")
    protected Pagination1 pgntn;
    @XmlElement(name = "Ntfctn")
    protected CorporateActionNotificationSD10 ntfctn;
    @XmlElement(name = "GnlInf")
    protected CorporateActionGeneralInformationSD48 gnlInf;
    @XmlElement(name = "UndrlygScty")
    protected FinancialInstrumentAttributesSD20 undrlygScty;
    @XmlElement(name = "EvtsLkg")
    protected List<CorporateActionCancellationSD3> evtsLkg;
    @XmlElement(name = "XtrnlCmnts")
    protected CorporateActionCancellationSD4 xtrnlCmnts;

    /**
     * Gets the value of the pgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination1 }
     *     
     */
    public Pagination1 getPgntn() {
        return pgntn;
    }

    /**
     * Sets the value of the pgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination1 }
     *     
     */
    public DTCCCACNSD1V11 setPgntn(Pagination1 value) {
        this.pgntn = value;
        return this;
    }

    /**
     * Gets the value of the ntfctn property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNotificationSD10 }
     *     
     */
    public CorporateActionNotificationSD10 getNtfctn() {
        return ntfctn;
    }

    /**
     * Sets the value of the ntfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNotificationSD10 }
     *     
     */
    public DTCCCACNSD1V11 setNtfctn(CorporateActionNotificationSD10 value) {
        this.ntfctn = value;
        return this;
    }

    /**
     * Gets the value of the gnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionGeneralInformationSD48 }
     *     
     */
    public CorporateActionGeneralInformationSD48 getGnlInf() {
        return gnlInf;
    }

    /**
     * Sets the value of the gnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionGeneralInformationSD48 }
     *     
     */
    public DTCCCACNSD1V11 setGnlInf(CorporateActionGeneralInformationSD48 value) {
        this.gnlInf = value;
        return this;
    }

    /**
     * Gets the value of the undrlygScty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributesSD20 }
     *     
     */
    public FinancialInstrumentAttributesSD20 getUndrlygScty() {
        return undrlygScty;
    }

    /**
     * Sets the value of the undrlygScty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributesSD20 }
     *     
     */
    public DTCCCACNSD1V11 setUndrlygScty(FinancialInstrumentAttributesSD20 value) {
        this.undrlygScty = value;
        return this;
    }

    /**
     * Gets the value of the evtsLkg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the evtsLkg property.
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
     * {@link CorporateActionCancellationSD3 }
     * 
     * 
     * @return
     *     The value of the evtsLkg property.
     */
    public List<CorporateActionCancellationSD3> getEvtsLkg() {
        if (evtsLkg == null) {
            evtsLkg = new ArrayList<>();
        }
        return this.evtsLkg;
    }

    /**
     * Gets the value of the xtrnlCmnts property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionCancellationSD4 }
     *     
     */
    public CorporateActionCancellationSD4 getXtrnlCmnts() {
        return xtrnlCmnts;
    }

    /**
     * Sets the value of the xtrnlCmnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionCancellationSD4 }
     *     
     */
    public DTCCCACNSD1V11 setXtrnlCmnts(CorporateActionCancellationSD4 value) {
        this.xtrnlCmnts = value;
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

    /**
     * Adds a new item to the evtsLkg list.
     * @see #getEvtsLkg()
     * 
     */
    public DTCCCACNSD1V11 addEvtsLkg(CorporateActionCancellationSD3 evtsLkg) {
        getEvtsLkg().add(evtsLkg);
        return this;
    }

}
