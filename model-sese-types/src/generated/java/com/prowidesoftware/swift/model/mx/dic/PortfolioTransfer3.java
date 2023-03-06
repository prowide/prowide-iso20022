
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * Type of product and assets to be transferred.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortfolioTransfer3", propOrder = {
    "mstrRef",
    "trfId",
    "trfConfId",
    "reqdTrfDt",
    "prtfl",
    "allOthrCsh",
    "cshAll",
    "rsdlCsh",
    "pmtDtls",
    "finInstrmAsstForTrf",
    "addtlInf"
})
public class PortfolioTransfer3 {

    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "TrfId", required = true)
    protected String trfId;
    @XmlElement(name = "TrfConfId")
    protected String trfConfId;
    @XmlElement(name = "ReqdTrfDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reqdTrfDt;
    @XmlElement(name = "Prtfl")
    protected FundPortfolio3Choice prtfl;
    @XmlElement(name = "AllOthrCsh")
    @XmlSchemaType(name = "string")
    protected AllOtherCash1Code allOthrCsh;
    @XmlElement(name = "CshAll")
    @XmlSchemaType(name = "string")
    protected CashAll1Code cshAll;
    @XmlElement(name = "RsdlCsh")
    @XmlSchemaType(name = "string")
    protected ResidualCash1Code rsdlCsh;
    @XmlElement(name = "PmtDtls")
    protected PaymentInstrument14 pmtDtls;
    @XmlElement(name = "FinInstrmAsstForTrf")
    protected List<FinancialInstrument69> finInstrmAsstForTrf;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the mstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrRef() {
        return mstrRef;
    }

    /**
     * Sets the value of the mstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PortfolioTransfer3 setMstrRef(String value) {
        this.mstrRef = value;
        return this;
    }

    /**
     * Gets the value of the trfId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfId() {
        return trfId;
    }

    /**
     * Sets the value of the trfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PortfolioTransfer3 setTrfId(String value) {
        this.trfId = value;
        return this;
    }

    /**
     * Gets the value of the trfConfId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfConfId() {
        return trfConfId;
    }

    /**
     * Sets the value of the trfConfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PortfolioTransfer3 setTrfConfId(String value) {
        this.trfConfId = value;
        return this;
    }

    /**
     * Gets the value of the reqdTrfDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getReqdTrfDt() {
        return reqdTrfDt;
    }

    /**
     * Sets the value of the reqdTrfDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PortfolioTransfer3 setReqdTrfDt(XMLGregorianCalendar value) {
        this.reqdTrfDt = value;
        return this;
    }

    /**
     * Gets the value of the prtfl property.
     * 
     * @return
     *     possible object is
     *     {@link FundPortfolio3Choice }
     *     
     */
    public FundPortfolio3Choice getPrtfl() {
        return prtfl;
    }

    /**
     * Sets the value of the prtfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundPortfolio3Choice }
     *     
     */
    public PortfolioTransfer3 setPrtfl(FundPortfolio3Choice value) {
        this.prtfl = value;
        return this;
    }

    /**
     * Gets the value of the allOthrCsh property.
     * 
     * @return
     *     possible object is
     *     {@link AllOtherCash1Code }
     *     
     */
    public AllOtherCash1Code getAllOthrCsh() {
        return allOthrCsh;
    }

    /**
     * Sets the value of the allOthrCsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllOtherCash1Code }
     *     
     */
    public PortfolioTransfer3 setAllOthrCsh(AllOtherCash1Code value) {
        this.allOthrCsh = value;
        return this;
    }

    /**
     * Gets the value of the cshAll property.
     * 
     * @return
     *     possible object is
     *     {@link CashAll1Code }
     *     
     */
    public CashAll1Code getCshAll() {
        return cshAll;
    }

    /**
     * Sets the value of the cshAll property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAll1Code }
     *     
     */
    public PortfolioTransfer3 setCshAll(CashAll1Code value) {
        this.cshAll = value;
        return this;
    }

    /**
     * Gets the value of the rsdlCsh property.
     * 
     * @return
     *     possible object is
     *     {@link ResidualCash1Code }
     *     
     */
    public ResidualCash1Code getRsdlCsh() {
        return rsdlCsh;
    }

    /**
     * Sets the value of the rsdlCsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidualCash1Code }
     *     
     */
    public PortfolioTransfer3 setRsdlCsh(ResidualCash1Code value) {
        this.rsdlCsh = value;
        return this;
    }

    /**
     * Gets the value of the pmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument14 }
     *     
     */
    public PaymentInstrument14 getPmtDtls() {
        return pmtDtls;
    }

    /**
     * Sets the value of the pmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument14 }
     *     
     */
    public PortfolioTransfer3 setPmtDtls(PaymentInstrument14 value) {
        this.pmtDtls = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmAsstForTrf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the finInstrmAsstForTrf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinInstrmAsstForTrf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrument69 }
     * 
     * 
     */
    public List<FinancialInstrument69> getFinInstrmAsstForTrf() {
        if (finInstrmAsstForTrf == null) {
            finInstrmAsstForTrf = new ArrayList<FinancialInstrument69>();
        }
        return this.finInstrmAsstForTrf;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addtlInf property.
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
     */
    public List<AdditionalInformation15> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<AdditionalInformation15>();
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
     * Adds a new item to the finInstrmAsstForTrf list.
     * @see #getFinInstrmAsstForTrf()
     * 
     */
    public PortfolioTransfer3 addFinInstrmAsstForTrf(FinancialInstrument69 finInstrmAsstForTrf) {
        getFinInstrmAsstForTrf().add(finInstrmAsstForTrf);
        return this;
    }

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public PortfolioTransfer3 addAddtlInf(AdditionalInformation15 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
