
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Security that is a sub-set of an investment fund, and is governed by the same investment fund policy, eg, dividend option or valuation currency.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrument16", propOrder = {
    "id",
    "nm",
    "clssTp",
    "umbrllNm",
    "ctryOfDmcl",
    "regdDstrbtnCtry",
    "dnmtnCcy",
    "dstrbtnPlcy",
    "dvddPlcy",
    "sctiesForm",
    "dmtrlsdInd",
    "dvddFrqcy",
    "rinvstmtFrqcy",
    "euSvgsDrctv",
    "frntEndLdInd",
    "bckEndLdInd",
    "swtchFeeInd"
})
public class FinancialInstrument16 {

    @XmlElement(name = "Id", required = true)
    protected SecurityIdentification7 id;
    @XmlElement(name = "Nm", required = true)
    protected String nm;
    @XmlElement(name = "ClssTp")
    protected String clssTp;
    @XmlElement(name = "UmbrllNm")
    protected String umbrllNm;
    @XmlElement(name = "CtryOfDmcl", required = true)
    protected String ctryOfDmcl;
    @XmlElement(name = "RegdDstrbtnCtry", required = true)
    protected List<String> regdDstrbtnCtry;
    @XmlElement(name = "DnmtnCcy", required = true)
    protected String dnmtnCcy;
    @XmlElement(name = "DstrbtnPlcy", required = true)
    @XmlSchemaType(name = "string")
    protected DistributionPolicy1Code dstrbtnPlcy;
    @XmlElement(name = "DvddPlcy")
    @XmlSchemaType(name = "string")
    protected DividendPolicy1Code dvddPlcy;
    @XmlElement(name = "SctiesForm", required = true)
    @XmlSchemaType(name = "string")
    protected FormOfSecurity1Code sctiesForm;
    @XmlElement(name = "DmtrlsdInd")
    protected boolean dmtrlsdInd;
    @XmlElement(name = "DvddFrqcy")
    @XmlSchemaType(name = "string")
    protected EventFrequency2Code dvddFrqcy;
    @XmlElement(name = "RinvstmtFrqcy")
    @XmlSchemaType(name = "string")
    protected EventFrequency2Code rinvstmtFrqcy;
    @XmlElement(name = "EUSvgsDrctv")
    @XmlSchemaType(name = "string")
    protected EUSavingsDirective1Code euSvgsDrctv;
    @XmlElement(name = "FrntEndLdInd")
    protected boolean frntEndLdInd;
    @XmlElement(name = "BckEndLdInd")
    protected boolean bckEndLdInd;
    @XmlElement(name = "SwtchFeeInd")
    protected boolean swtchFeeInd;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public SecurityIdentification7 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public FinancialInstrument16 setId(SecurityIdentification7 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrument16 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the clssTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClssTp() {
        return clssTp;
    }

    /**
     * Sets the value of the clssTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrument16 setClssTp(String value) {
        this.clssTp = value;
        return this;
    }

    /**
     * Gets the value of the umbrllNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUmbrllNm() {
        return umbrllNm;
    }

    /**
     * Sets the value of the umbrllNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrument16 setUmbrllNm(String value) {
        this.umbrllNm = value;
        return this;
    }

    /**
     * Gets the value of the ctryOfDmcl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfDmcl() {
        return ctryOfDmcl;
    }

    /**
     * Sets the value of the ctryOfDmcl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrument16 setCtryOfDmcl(String value) {
        this.ctryOfDmcl = value;
        return this;
    }

    /**
     * Gets the value of the regdDstrbtnCtry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regdDstrbtnCtry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegdDstrbtnCtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRegdDstrbtnCtry() {
        if (regdDstrbtnCtry == null) {
            regdDstrbtnCtry = new ArrayList<String>();
        }
        return this.regdDstrbtnCtry;
    }

    /**
     * Gets the value of the dnmtnCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDnmtnCcy() {
        return dnmtnCcy;
    }

    /**
     * Sets the value of the dnmtnCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrument16 setDnmtnCcy(String value) {
        this.dnmtnCcy = value;
        return this;
    }

    /**
     * Gets the value of the dstrbtnPlcy property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionPolicy1Code }
     *     
     */
    public DistributionPolicy1Code getDstrbtnPlcy() {
        return dstrbtnPlcy;
    }

    /**
     * Sets the value of the dstrbtnPlcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionPolicy1Code }
     *     
     */
    public FinancialInstrument16 setDstrbtnPlcy(DistributionPolicy1Code value) {
        this.dstrbtnPlcy = value;
        return this;
    }

    /**
     * Gets the value of the dvddPlcy property.
     * 
     * @return
     *     possible object is
     *     {@link DividendPolicy1Code }
     *     
     */
    public DividendPolicy1Code getDvddPlcy() {
        return dvddPlcy;
    }

    /**
     * Sets the value of the dvddPlcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DividendPolicy1Code }
     *     
     */
    public FinancialInstrument16 setDvddPlcy(DividendPolicy1Code value) {
        this.dvddPlcy = value;
        return this;
    }

    /**
     * Gets the value of the sctiesForm property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfSecurity1Code }
     *     
     */
    public FormOfSecurity1Code getSctiesForm() {
        return sctiesForm;
    }

    /**
     * Sets the value of the sctiesForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfSecurity1Code }
     *     
     */
    public FinancialInstrument16 setSctiesForm(FormOfSecurity1Code value) {
        this.sctiesForm = value;
        return this;
    }

    /**
     * Gets the value of the dmtrlsdInd property.
     * 
     */
    public boolean isDmtrlsdInd() {
        return dmtrlsdInd;
    }

    /**
     * Sets the value of the dmtrlsdInd property.
     * 
     */
    public FinancialInstrument16 setDmtrlsdInd(boolean value) {
        this.dmtrlsdInd = value;
        return this;
    }

    /**
     * Gets the value of the dvddFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link EventFrequency2Code }
     *     
     */
    public EventFrequency2Code getDvddFrqcy() {
        return dvddFrqcy;
    }

    /**
     * Sets the value of the dvddFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventFrequency2Code }
     *     
     */
    public FinancialInstrument16 setDvddFrqcy(EventFrequency2Code value) {
        this.dvddFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the rinvstmtFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link EventFrequency2Code }
     *     
     */
    public EventFrequency2Code getRinvstmtFrqcy() {
        return rinvstmtFrqcy;
    }

    /**
     * Sets the value of the rinvstmtFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventFrequency2Code }
     *     
     */
    public FinancialInstrument16 setRinvstmtFrqcy(EventFrequency2Code value) {
        this.rinvstmtFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the euSvgsDrctv property.
     * 
     * @return
     *     possible object is
     *     {@link EUSavingsDirective1Code }
     *     
     */
    public EUSavingsDirective1Code getEUSvgsDrctv() {
        return euSvgsDrctv;
    }

    /**
     * Sets the value of the euSvgsDrctv property.
     * 
     * @param value
     *     allowed object is
     *     {@link EUSavingsDirective1Code }
     *     
     */
    public FinancialInstrument16 setEUSvgsDrctv(EUSavingsDirective1Code value) {
        this.euSvgsDrctv = value;
        return this;
    }

    /**
     * Gets the value of the frntEndLdInd property.
     * 
     */
    public boolean isFrntEndLdInd() {
        return frntEndLdInd;
    }

    /**
     * Sets the value of the frntEndLdInd property.
     * 
     */
    public FinancialInstrument16 setFrntEndLdInd(boolean value) {
        this.frntEndLdInd = value;
        return this;
    }

    /**
     * Gets the value of the bckEndLdInd property.
     * 
     */
    public boolean isBckEndLdInd() {
        return bckEndLdInd;
    }

    /**
     * Sets the value of the bckEndLdInd property.
     * 
     */
    public FinancialInstrument16 setBckEndLdInd(boolean value) {
        this.bckEndLdInd = value;
        return this;
    }

    /**
     * Gets the value of the swtchFeeInd property.
     * 
     */
    public boolean isSwtchFeeInd() {
        return swtchFeeInd;
    }

    /**
     * Sets the value of the swtchFeeInd property.
     * 
     */
    public FinancialInstrument16 setSwtchFeeInd(boolean value) {
        this.swtchFeeInd = value;
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
     * Adds a new item to the regdDstrbtnCtry list.
     * @see #getRegdDstrbtnCtry()
     * 
     */
    public FinancialInstrument16 addRegdDstrbtnCtry(String regdDstrbtnCtry) {
        getRegdDstrbtnCtry().add(regdDstrbtnCtry);
        return this;
    }

}
