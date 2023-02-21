
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the loan data details in case of a securities lending transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanData134", propOrder = {
    "ctrctTp",
    "clrd",
    "prtflCd",
    "tradgVn",
    "mstrAgrmtTp",
    "mtrtyDt",
    "gnlColl",
    "term",
    "rates",
    "prncplAmtCcy",
    "pricCcy",
    "scty",
    "outsdngMrgnLnCcy"
})
public class LoanData134 {

    @XmlElement(name = "CtrctTp")
    @XmlSchemaType(name = "string")
    protected ExposureType10Code ctrctTp;
    @XmlElement(name = "Clrd")
    protected Boolean clrd;
    @XmlElement(name = "PrtflCd")
    protected String prtflCd;
    @XmlElement(name = "TradgVn")
    protected TradingVenueType1Choice tradgVn;
    @XmlElement(name = "MstrAgrmtTp")
    protected String mstrAgrmtTp;
    @XmlElement(name = "MtrtyDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mtrtyDt;
    @XmlElement(name = "GnlColl")
    @XmlSchemaType(name = "string")
    protected SpecialCollateral1Code gnlColl;
    @XmlElement(name = "Term")
    protected ContractTerm6Choice term;
    @XmlElement(name = "Rates")
    protected Rates1Choice rates;
    @XmlElement(name = "PrncplAmtCcy")
    protected String prncplAmtCcy;
    @XmlElement(name = "PricCcy")
    protected String pricCcy;
    @XmlElement(name = "Scty")
    protected Security49 scty;
    @XmlElement(name = "OutsdngMrgnLnCcy")
    protected String outsdngMrgnLnCcy;

    /**
     * Gets the value of the ctrctTp property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureType10Code }
     *     
     */
    public ExposureType10Code getCtrctTp() {
        return ctrctTp;
    }

    /**
     * Sets the value of the ctrctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureType10Code }
     *     
     */
    public LoanData134 setCtrctTp(ExposureType10Code value) {
        this.ctrctTp = value;
        return this;
    }

    /**
     * Gets the value of the clrd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClrd() {
        return clrd;
    }

    /**
     * Sets the value of the clrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public LoanData134 setClrd(Boolean value) {
        this.clrd = value;
        return this;
    }

    /**
     * Gets the value of the prtflCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtflCd() {
        return prtflCd;
    }

    /**
     * Sets the value of the prtflCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoanData134 setPrtflCd(String value) {
        this.prtflCd = value;
        return this;
    }

    /**
     * Gets the value of the tradgVn property.
     * 
     * @return
     *     possible object is
     *     {@link TradingVenueType1Choice }
     *     
     */
    public TradingVenueType1Choice getTradgVn() {
        return tradgVn;
    }

    /**
     * Sets the value of the tradgVn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingVenueType1Choice }
     *     
     */
    public LoanData134 setTradgVn(TradingVenueType1Choice value) {
        this.tradgVn = value;
        return this;
    }

    /**
     * Gets the value of the mstrAgrmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrAgrmtTp() {
        return mstrAgrmtTp;
    }

    /**
     * Sets the value of the mstrAgrmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoanData134 setMstrAgrmtTp(String value) {
        this.mstrAgrmtTp = value;
        return this;
    }

    /**
     * Gets the value of the mtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getMtrtyDt() {
        return mtrtyDt;
    }

    /**
     * Sets the value of the mtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoanData134 setMtrtyDt(XMLGregorianCalendar value) {
        this.mtrtyDt = value;
        return this;
    }

    /**
     * Gets the value of the gnlColl property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialCollateral1Code }
     *     
     */
    public SpecialCollateral1Code getGnlColl() {
        return gnlColl;
    }

    /**
     * Sets the value of the gnlColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialCollateral1Code }
     *     
     */
    public LoanData134 setGnlColl(SpecialCollateral1Code value) {
        this.gnlColl = value;
        return this;
    }

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link ContractTerm6Choice }
     *     
     */
    public ContractTerm6Choice getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractTerm6Choice }
     *     
     */
    public LoanData134 setTerm(ContractTerm6Choice value) {
        this.term = value;
        return this;
    }

    /**
     * Gets the value of the rates property.
     * 
     * @return
     *     possible object is
     *     {@link Rates1Choice }
     *     
     */
    public Rates1Choice getRates() {
        return rates;
    }

    /**
     * Sets the value of the rates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rates1Choice }
     *     
     */
    public LoanData134 setRates(Rates1Choice value) {
        this.rates = value;
        return this;
    }

    /**
     * Gets the value of the prncplAmtCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrncplAmtCcy() {
        return prncplAmtCcy;
    }

    /**
     * Sets the value of the prncplAmtCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoanData134 setPrncplAmtCcy(String value) {
        this.prncplAmtCcy = value;
        return this;
    }

    /**
     * Gets the value of the pricCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricCcy() {
        return pricCcy;
    }

    /**
     * Sets the value of the pricCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoanData134 setPricCcy(String value) {
        this.pricCcy = value;
        return this;
    }

    /**
     * Gets the value of the scty property.
     * 
     * @return
     *     possible object is
     *     {@link Security49 }
     *     
     */
    public Security49 getScty() {
        return scty;
    }

    /**
     * Sets the value of the scty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Security49 }
     *     
     */
    public LoanData134 setScty(Security49 value) {
        this.scty = value;
        return this;
    }

    /**
     * Gets the value of the outsdngMrgnLnCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutsdngMrgnLnCcy() {
        return outsdngMrgnLnCcy;
    }

    /**
     * Sets the value of the outsdngMrgnLnCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LoanData134 setOutsdngMrgnLnCcy(String value) {
        this.outsdngMrgnLnCcy = value;
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

}
