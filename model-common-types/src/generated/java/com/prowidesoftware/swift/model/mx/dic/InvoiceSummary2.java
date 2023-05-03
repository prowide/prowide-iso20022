
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
 * Summary information about the sale
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceSummary2", propOrder = {
    "invcNb",
    "sellr",
    "buyr",
    "invcDt",
    "invcCreDtTm",
    "summryCmmdtyId",
    "frghtAmt",
    "taxTtl",
    "taxRclmMtd",
    "addtlData"
})
public class InvoiceSummary2 {

    @XmlElement(name = "InvcNb")
    protected String invcNb;
    @XmlElement(name = "Sellr")
    protected PartyIdentification259 sellr;
    @XmlElement(name = "Buyr")
    protected PartyIdentification259 buyr;
    @XmlElement(name = "InvcDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate invcDt;
    @XmlElement(name = "InvcCreDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime invcCreDtTm;
    @XmlElement(name = "SummryCmmdtyId")
    protected String summryCmmdtyId;
    @XmlElement(name = "FrghtAmt")
    protected BigDecimal frghtAmt;
    @XmlElement(name = "TaxTtl")
    protected List<Tax39> taxTtl;
    @XmlElement(name = "TaxRclmMtd")
    @XmlSchemaType(name = "string")
    protected TaxReclaimMethod1Code taxRclmMtd;
    @XmlElement(name = "AddtlData")
    protected String addtlData;

    /**
     * Gets the value of the invcNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvcNb() {
        return invcNb;
    }

    /**
     * Sets the value of the invcNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvoiceSummary2 setInvcNb(String value) {
        this.invcNb = value;
        return this;
    }

    /**
     * Gets the value of the sellr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification259 }
     *     
     */
    public PartyIdentification259 getSellr() {
        return sellr;
    }

    /**
     * Sets the value of the sellr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification259 }
     *     
     */
    public InvoiceSummary2 setSellr(PartyIdentification259 value) {
        this.sellr = value;
        return this;
    }

    /**
     * Gets the value of the buyr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification259 }
     *     
     */
    public PartyIdentification259 getBuyr() {
        return buyr;
    }

    /**
     * Sets the value of the buyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification259 }
     *     
     */
    public InvoiceSummary2 setBuyr(PartyIdentification259 value) {
        this.buyr = value;
        return this;
    }

    /**
     * Gets the value of the invcDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getInvcDt() {
        return invcDt;
    }

    /**
     * Sets the value of the invcDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvoiceSummary2 setInvcDt(LocalDate value) {
        this.invcDt = value;
        return this;
    }

    /**
     * Gets the value of the invcCreDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getInvcCreDtTm() {
        return invcCreDtTm;
    }

    /**
     * Sets the value of the invcCreDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvoiceSummary2 setInvcCreDtTm(OffsetDateTime value) {
        this.invcCreDtTm = value;
        return this;
    }

    /**
     * Gets the value of the summryCmmdtyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummryCmmdtyId() {
        return summryCmmdtyId;
    }

    /**
     * Sets the value of the summryCmmdtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvoiceSummary2 setSummryCmmdtyId(String value) {
        this.summryCmmdtyId = value;
        return this;
    }

    /**
     * Gets the value of the frghtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFrghtAmt() {
        return frghtAmt;
    }

    /**
     * Sets the value of the frghtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InvoiceSummary2 setFrghtAmt(BigDecimal value) {
        this.frghtAmt = value;
        return this;
    }

    /**
     * Gets the value of the taxTtl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxTtl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxTtl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax39 }
     * 
     * 
     * @return
     *     The value of the taxTtl property.
     */
    public List<Tax39> getTaxTtl() {
        if (taxTtl == null) {
            taxTtl = new ArrayList<>();
        }
        return this.taxTtl;
    }

    /**
     * Gets the value of the taxRclmMtd property.
     * 
     * @return
     *     possible object is
     *     {@link TaxReclaimMethod1Code }
     *     
     */
    public TaxReclaimMethod1Code getTaxRclmMtd() {
        return taxRclmMtd;
    }

    /**
     * Sets the value of the taxRclmMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxReclaimMethod1Code }
     *     
     */
    public InvoiceSummary2 setTaxRclmMtd(TaxReclaimMethod1Code value) {
        this.taxRclmMtd = value;
        return this;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlData() {
        return addtlData;
    }

    /**
     * Sets the value of the addtlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvoiceSummary2 setAddtlData(String value) {
        this.addtlData = value;
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
     * Adds a new item to the taxTtl list.
     * @see #getTaxTtl()
     * 
     */
    public InvoiceSummary2 addTaxTtl(Tax39 taxTtl) {
        getTaxTtl().add(taxTtl);
        return this;
    }

}
