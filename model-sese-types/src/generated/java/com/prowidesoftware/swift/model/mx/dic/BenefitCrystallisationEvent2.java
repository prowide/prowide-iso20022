
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
 * Information about the realisation of benefits taken from a pension.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BenefitCrystallisationEvent2", propOrder = {
    "evtTpNb",
    "evtTpNm",
    "evtDt",
    "crstllstnAmt",
    "pctgOfAllwnc",
    "lftmAllwncPrtcn",
    "addtlInf"
})
public class BenefitCrystallisationEvent2 {

    @XmlElement(name = "EvtTpNb")
    protected String evtTpNb;
    @XmlElement(name = "EvtTpNm")
    protected String evtTpNm;
    @XmlElement(name = "EvtDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate evtDt;
    @XmlElement(name = "CrstllstnAmt")
    protected ActiveCurrencyAnd13DecimalAmount crstllstnAmt;
    @XmlElement(name = "PctgOfAllwnc")
    protected BigDecimal pctgOfAllwnc;
    @XmlElement(name = "LftmAllwncPrtcn")
    protected Boolean lftmAllwncPrtcn;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the evtTpNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtTpNb() {
        return evtTpNb;
    }

    /**
     * Sets the value of the evtTpNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BenefitCrystallisationEvent2 setEvtTpNb(String value) {
        this.evtTpNb = value;
        return this;
    }

    /**
     * Gets the value of the evtTpNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtTpNm() {
        return evtTpNm;
    }

    /**
     * Sets the value of the evtTpNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BenefitCrystallisationEvent2 setEvtTpNm(String value) {
        this.evtTpNm = value;
        return this;
    }

    /**
     * Gets the value of the evtDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEvtDt() {
        return evtDt;
    }

    /**
     * Sets the value of the evtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BenefitCrystallisationEvent2 setEvtDt(LocalDate value) {
        this.evtDt = value;
        return this;
    }

    /**
     * Gets the value of the crstllstnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getCrstllstnAmt() {
        return crstllstnAmt;
    }

    /**
     * Sets the value of the crstllstnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public BenefitCrystallisationEvent2 setCrstllstnAmt(ActiveCurrencyAnd13DecimalAmount value) {
        this.crstllstnAmt = value;
        return this;
    }

    /**
     * Gets the value of the pctgOfAllwnc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctgOfAllwnc() {
        return pctgOfAllwnc;
    }

    /**
     * Sets the value of the pctgOfAllwnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public BenefitCrystallisationEvent2 setPctgOfAllwnc(BigDecimal value) {
        this.pctgOfAllwnc = value;
        return this;
    }

    /**
     * Gets the value of the lftmAllwncPrtcn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLftmAllwncPrtcn() {
        return lftmAllwncPrtcn;
    }

    /**
     * Sets the value of the lftmAllwncPrtcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public BenefitCrystallisationEvent2 setLftmAllwncPrtcn(Boolean value) {
        this.lftmAllwncPrtcn = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
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
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditionalInformation15> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
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
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public BenefitCrystallisationEvent2 addAddtlInf(AdditionalInformation15 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
