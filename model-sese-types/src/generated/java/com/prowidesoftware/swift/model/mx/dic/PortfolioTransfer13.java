
package com.prowidesoftware.swift.model.mx.dic;

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
 * Type of product and assets to be transferred.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortfolioTransfer13", propOrder = {
    "mstrRef",
    "trfInstrRef",
    "trfCmpltnId",
    "actlTrfDt",
    "prtfl",
    "allOthrCsh",
    "cshAll",
    "rsdlCsh",
    "taxDt",
    "pmtDtls",
    "finInstrmAsstForTrf",
    "addtlInf"
})
public class PortfolioTransfer13 {

    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "TrfInstrRef", required = true)
    protected String trfInstrRef;
    @XmlElement(name = "TrfCmpltnId", required = true)
    protected String trfCmpltnId;
    @XmlElement(name = "ActlTrfDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate actlTrfDt;
    @XmlElement(name = "Prtfl")
    protected FundPortfolio7Choice prtfl;
    @XmlElement(name = "AllOthrCsh")
    protected List<AllOtherCash1> allOthrCsh;
    @XmlElement(name = "CshAll")
    protected List<CashAll1> cshAll;
    @XmlElement(name = "RsdlCsh")
    protected List<ResidualCash2> rsdlCsh;
    @XmlElement(name = "TaxDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate taxDt;
    @XmlElement(name = "PmtDtls")
    protected PaymentInstrument20 pmtDtls;
    @XmlElement(name = "FinInstrmAsstForTrf")
    protected List<FinancialInstrument105> finInstrmAsstForTrf;
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
    public PortfolioTransfer13 setMstrRef(String value) {
        this.mstrRef = value;
        return this;
    }

    /**
     * Gets the value of the trfInstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfInstrRef() {
        return trfInstrRef;
    }

    /**
     * Sets the value of the trfInstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PortfolioTransfer13 setTrfInstrRef(String value) {
        this.trfInstrRef = value;
        return this;
    }

    /**
     * Gets the value of the trfCmpltnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfCmpltnId() {
        return trfCmpltnId;
    }

    /**
     * Sets the value of the trfCmpltnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PortfolioTransfer13 setTrfCmpltnId(String value) {
        this.trfCmpltnId = value;
        return this;
    }

    /**
     * Gets the value of the actlTrfDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getActlTrfDt() {
        return actlTrfDt;
    }

    /**
     * Sets the value of the actlTrfDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PortfolioTransfer13 setActlTrfDt(LocalDate value) {
        this.actlTrfDt = value;
        return this;
    }

    /**
     * Gets the value of the prtfl property.
     * 
     * @return
     *     possible object is
     *     {@link FundPortfolio7Choice }
     *     
     */
    public FundPortfolio7Choice getPrtfl() {
        return prtfl;
    }

    /**
     * Sets the value of the prtfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundPortfolio7Choice }
     *     
     */
    public PortfolioTransfer13 setPrtfl(FundPortfolio7Choice value) {
        this.prtfl = value;
        return this;
    }

    /**
     * Gets the value of the allOthrCsh property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the allOthrCsh property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllOthrCsh().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllOtherCash1 }
     * 
     * 
     * @return
     *     The value of the allOthrCsh property.
     */
    public List<AllOtherCash1> getAllOthrCsh() {
        if (allOthrCsh == null) {
            allOthrCsh = new ArrayList<>();
        }
        return this.allOthrCsh;
    }

    /**
     * Gets the value of the cshAll property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshAll property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshAll().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashAll1 }
     * 
     * 
     * @return
     *     The value of the cshAll property.
     */
    public List<CashAll1> getCshAll() {
        if (cshAll == null) {
            cshAll = new ArrayList<>();
        }
        return this.cshAll;
    }

    /**
     * Gets the value of the rsdlCsh property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rsdlCsh property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRsdlCsh().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResidualCash2 }
     * 
     * 
     * @return
     *     The value of the rsdlCsh property.
     */
    public List<ResidualCash2> getRsdlCsh() {
        if (rsdlCsh == null) {
            rsdlCsh = new ArrayList<>();
        }
        return this.rsdlCsh;
    }

    /**
     * Gets the value of the taxDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getTaxDt() {
        return taxDt;
    }

    /**
     * Sets the value of the taxDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PortfolioTransfer13 setTaxDt(LocalDate value) {
        this.taxDt = value;
        return this;
    }

    /**
     * Gets the value of the pmtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument20 }
     *     
     */
    public PaymentInstrument20 getPmtDtls() {
        return pmtDtls;
    }

    /**
     * Sets the value of the pmtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument20 }
     *     
     */
    public PortfolioTransfer13 setPmtDtls(PaymentInstrument20 value) {
        this.pmtDtls = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmAsstForTrf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the finInstrmAsstForTrf property.
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
     * {@link FinancialInstrument105 }
     * 
     * 
     * @return
     *     The value of the finInstrmAsstForTrf property.
     */
    public List<FinancialInstrument105> getFinInstrmAsstForTrf() {
        if (finInstrmAsstForTrf == null) {
            finInstrmAsstForTrf = new ArrayList<>();
        }
        return this.finInstrmAsstForTrf;
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
     * Adds a new item to the allOthrCsh list.
     * @see #getAllOthrCsh()
     * 
     */
    public PortfolioTransfer13 addAllOthrCsh(AllOtherCash1 allOthrCsh) {
        getAllOthrCsh().add(allOthrCsh);
        return this;
    }

    /**
     * Adds a new item to the cshAll list.
     * @see #getCshAll()
     * 
     */
    public PortfolioTransfer13 addCshAll(CashAll1 cshAll) {
        getCshAll().add(cshAll);
        return this;
    }

    /**
     * Adds a new item to the rsdlCsh list.
     * @see #getRsdlCsh()
     * 
     */
    public PortfolioTransfer13 addRsdlCsh(ResidualCash2 rsdlCsh) {
        getRsdlCsh().add(rsdlCsh);
        return this;
    }

    /**
     * Adds a new item to the finInstrmAsstForTrf list.
     * @see #getFinInstrmAsstForTrf()
     * 
     */
    public PortfolioTransfer13 addFinInstrmAsstForTrf(FinancialInstrument105 finInstrmAsstForTrf) {
        getFinInstrmAsstForTrf().add(finInstrmAsstForTrf);
        return this;
    }

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public PortfolioTransfer13 addAddtlInf(AdditionalInformation15 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
