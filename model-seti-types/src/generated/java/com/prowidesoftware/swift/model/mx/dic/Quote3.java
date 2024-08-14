
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
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
 * Proposition of price for a financial instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quote3", propOrder = {
    "tp",
    "qlfr",
    "vldUntilDtTm",
    "prvsClsgPric",
    "pricTp",
    "reqdPric",
    "ccy",
    "qtOrgtr",
    "qtOrgtrRole",
    "rqstrElgblty",
    "srcOfQt"
})
public class Quote3 {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected QuoteType1Code tp;
    @XmlElement(name = "Qlfr")
    @XmlSchemaType(name = "string")
    protected List<Qualifier1Code> qlfr;
    @XmlElement(name = "VldUntilDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime vldUntilDtTm;
    @XmlElement(name = "PrvsClsgPric")
    protected Price1 prvsClsgPric;
    @XmlElement(name = "PricTp")
    @XmlSchemaType(name = "string")
    protected PriceValueType3Code pricTp;
    @XmlElement(name = "ReqdPric")
    protected Price1 reqdPric;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "QtOrgtr")
    protected PartyIdentification24Choice qtOrgtr;
    @XmlElement(name = "QtOrgtrRole")
    @XmlSchemaType(name = "string")
    protected OriginatorRole1Code qtOrgtrRole;
    @XmlElement(name = "RqstrElgblty")
    @XmlSchemaType(name = "string")
    protected Eligibility1Code rqstrElgblty;
    @XmlElement(name = "SrcOfQt")
    protected PartyIdentification25Choice srcOfQt;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteType1Code }
     *     
     */
    public QuoteType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteType1Code }
     *     
     */
    public Quote3 setTp(QuoteType1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the qlfr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the qlfr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQlfr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Qualifier1Code }
     * 
     * 
     * @return
     *     The value of the qlfr property.
     */
    public List<Qualifier1Code> getQlfr() {
        if (qlfr == null) {
            qlfr = new ArrayList<>();
        }
        return this.qlfr;
    }

    /**
     * Gets the value of the vldUntilDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getVldUntilDtTm() {
        return vldUntilDtTm;
    }

    /**
     * Sets the value of the vldUntilDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Quote3 setVldUntilDtTm(OffsetDateTime value) {
        this.vldUntilDtTm = value;
        return this;
    }

    /**
     * Gets the value of the prvsClsgPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price1 }
     *     
     */
    public Price1 getPrvsClsgPric() {
        return prvsClsgPric;
    }

    /**
     * Sets the value of the prvsClsgPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price1 }
     *     
     */
    public Quote3 setPrvsClsgPric(Price1 value) {
        this.prvsClsgPric = value;
        return this;
    }

    /**
     * Gets the value of the pricTp property.
     * 
     * @return
     *     possible object is
     *     {@link PriceValueType3Code }
     *     
     */
    public PriceValueType3Code getPricTp() {
        return pricTp;
    }

    /**
     * Sets the value of the pricTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceValueType3Code }
     *     
     */
    public Quote3 setPricTp(PriceValueType3Code value) {
        this.pricTp = value;
        return this;
    }

    /**
     * Gets the value of the reqdPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price1 }
     *     
     */
    public Price1 getReqdPric() {
        return reqdPric;
    }

    /**
     * Sets the value of the reqdPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price1 }
     *     
     */
    public Quote3 setReqdPric(Price1 value) {
        this.reqdPric = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Quote3 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the qtOrgtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification24Choice }
     *     
     */
    public PartyIdentification24Choice getQtOrgtr() {
        return qtOrgtr;
    }

    /**
     * Sets the value of the qtOrgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification24Choice }
     *     
     */
    public Quote3 setQtOrgtr(PartyIdentification24Choice value) {
        this.qtOrgtr = value;
        return this;
    }

    /**
     * Gets the value of the qtOrgtrRole property.
     * 
     * @return
     *     possible object is
     *     {@link OriginatorRole1Code }
     *     
     */
    public OriginatorRole1Code getQtOrgtrRole() {
        return qtOrgtrRole;
    }

    /**
     * Sets the value of the qtOrgtrRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatorRole1Code }
     *     
     */
    public Quote3 setQtOrgtrRole(OriginatorRole1Code value) {
        this.qtOrgtrRole = value;
        return this;
    }

    /**
     * Gets the value of the rqstrElgblty property.
     * 
     * @return
     *     possible object is
     *     {@link Eligibility1Code }
     *     
     */
    public Eligibility1Code getRqstrElgblty() {
        return rqstrElgblty;
    }

    /**
     * Sets the value of the rqstrElgblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Eligibility1Code }
     *     
     */
    public Quote3 setRqstrElgblty(Eligibility1Code value) {
        this.rqstrElgblty = value;
        return this;
    }

    /**
     * Gets the value of the srcOfQt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification25Choice }
     *     
     */
    public PartyIdentification25Choice getSrcOfQt() {
        return srcOfQt;
    }

    /**
     * Sets the value of the srcOfQt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification25Choice }
     *     
     */
    public Quote3 setSrcOfQt(PartyIdentification25Choice value) {
        this.srcOfQt = value;
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
     * Adds a new item to the qlfr list.
     * @see #getQlfr()
     * 
     */
    public Quote3 addQlfr(Qualifier1Code qlfr) {
        getQlfr().add(qlfr);
        return this;
    }

}
