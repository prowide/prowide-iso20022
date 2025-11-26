
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
 * Data related to order identification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderIdentification2", propOrder = {
    "ordrBookId",
    "seqNb",
    "prty",
    "tmStmp",
    "tradVn",
    "finInstrm",
    "ordrId",
    "dtOfRct",
    "vldtyPrd",
    "ordrRstrctn",
    "vldtyDtTm",
    "evtTp"
})
public class OrderIdentification2 {

    @XmlElement(name = "OrdrBookId", required = true)
    protected String ordrBookId;
    @XmlElement(name = "SeqNb", required = true)
    protected BigDecimal seqNb;
    @XmlElement(name = "Prty")
    protected OrderPriority1 prty;
    @XmlElement(name = "TmStmp", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime tmStmp;
    @XmlElement(name = "TradVn", required = true)
    protected String tradVn;
    @XmlElement(name = "FinInstrm", required = true)
    protected FinancialInstrument99Choice finInstrm;
    @XmlElement(name = "OrdrId")
    protected String ordrId;
    @XmlElement(name = "DtOfRct", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dtOfRct;
    @XmlElement(name = "VldtyPrd")
    protected ValidityPeriod1Choice vldtyPrd;
    @XmlElement(name = "OrdrRstrctn")
    protected List<OrderRestriction1Choice> ordrRstrctn;
    @XmlElement(name = "VldtyDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime vldtyDtTm;
    @XmlElement(name = "EvtTp")
    protected OrderEventType1Choice evtTp;

    /**
     * Gets the value of the ordrBookId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdrBookId() {
        return ordrBookId;
    }

    /**
     * Sets the value of the ordrBookId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrderIdentification2 setOrdrBookId(String value) {
        this.ordrBookId = value;
        return this;
    }

    /**
     * Gets the value of the seqNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeqNb() {
        return seqNb;
    }

    /**
     * Sets the value of the seqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public OrderIdentification2 setSeqNb(BigDecimal value) {
        this.seqNb = value;
        return this;
    }

    /**
     * Gets the value of the prty property.
     * 
     * @return
     *     possible object is
     *     {@link OrderPriority1 }
     *     
     */
    public OrderPriority1 getPrty() {
        return prty;
    }

    /**
     * Sets the value of the prty property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderPriority1 }
     *     
     */
    public OrderIdentification2 setPrty(OrderPriority1 value) {
        this.prty = value;
        return this;
    }

    /**
     * Gets the value of the tmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getTmStmp() {
        return tmStmp;
    }

    /**
     * Sets the value of the tmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrderIdentification2 setTmStmp(OffsetDateTime value) {
        this.tmStmp = value;
        return this;
    }

    /**
     * Gets the value of the tradVn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradVn() {
        return tradVn;
    }

    /**
     * Sets the value of the tradVn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrderIdentification2 setTradVn(String value) {
        this.tradVn = value;
        return this;
    }

    /**
     * Gets the value of the finInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument99Choice }
     *     
     */
    public FinancialInstrument99Choice getFinInstrm() {
        return finInstrm;
    }

    /**
     * Sets the value of the finInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument99Choice }
     *     
     */
    public OrderIdentification2 setFinInstrm(FinancialInstrument99Choice value) {
        this.finInstrm = value;
        return this;
    }

    /**
     * Gets the value of the ordrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdrId() {
        return ordrId;
    }

    /**
     * Sets the value of the ordrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrderIdentification2 setOrdrId(String value) {
        this.ordrId = value;
        return this;
    }

    /**
     * Gets the value of the dtOfRct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDtOfRct() {
        return dtOfRct;
    }

    /**
     * Sets the value of the dtOfRct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrderIdentification2 setDtOfRct(LocalDate value) {
        this.dtOfRct = value;
        return this;
    }

    /**
     * Gets the value of the vldtyPrd property.
     * 
     * @return
     *     possible object is
     *     {@link ValidityPeriod1Choice }
     *     
     */
    public ValidityPeriod1Choice getVldtyPrd() {
        return vldtyPrd;
    }

    /**
     * Sets the value of the vldtyPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidityPeriod1Choice }
     *     
     */
    public OrderIdentification2 setVldtyPrd(ValidityPeriod1Choice value) {
        this.vldtyPrd = value;
        return this;
    }

    /**
     * Gets the value of the ordrRstrctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ordrRstrctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrdrRstrctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderRestriction1Choice }
     * 
     * 
     * @return
     *     The value of the ordrRstrctn property.
     */
    public List<OrderRestriction1Choice> getOrdrRstrctn() {
        if (ordrRstrctn == null) {
            ordrRstrctn = new ArrayList<>();
        }
        return this.ordrRstrctn;
    }

    /**
     * Gets the value of the vldtyDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getVldtyDtTm() {
        return vldtyDtTm;
    }

    /**
     * Sets the value of the vldtyDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OrderIdentification2 setVldtyDtTm(OffsetDateTime value) {
        this.vldtyDtTm = value;
        return this;
    }

    /**
     * Gets the value of the evtTp property.
     * 
     * @return
     *     possible object is
     *     {@link OrderEventType1Choice }
     *     
     */
    public OrderEventType1Choice getEvtTp() {
        return evtTp;
    }

    /**
     * Sets the value of the evtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderEventType1Choice }
     *     
     */
    public OrderIdentification2 setEvtTp(OrderEventType1Choice value) {
        this.evtTp = value;
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
     * Adds a new item to the ordrRstrctn list.
     * @see #getOrdrRstrctn()
     * 
     */
    public OrderIdentification2 addOrdrRstrctn(OrderRestriction1Choice ordrRstrctn) {
        getOrdrRstrctn().add(ordrRstrctn);
        return this;
    }

}
