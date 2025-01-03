
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
@XmlType(name = "PortfolioTransfer7", propOrder = {
    "mstrRef",
    "trfId",
    "trfConfId",
    "prtfl",
    "prtlDscvry",
    "rsdlCsh",
    "taxDt",
    "finInstrmAsstForTrf",
    "addtlInf"
})
public class PortfolioTransfer7 {

    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "TrfId", required = true)
    protected String trfId;
    @XmlElement(name = "TrfConfId")
    protected String trfConfId;
    @XmlElement(name = "Prtfl")
    protected FundPortfolio5Choice prtfl;
    @XmlElement(name = "PrtlDscvry")
    protected Boolean prtlDscvry;
    @XmlElement(name = "RsdlCsh")
    protected List<ResidualCash1> rsdlCsh;
    @XmlElement(name = "TaxDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate taxDt;
    @XmlElement(name = "FinInstrmAsstForTrf")
    protected List<FinancialInstrument85> finInstrmAsstForTrf;
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
    public PortfolioTransfer7 setMstrRef(String value) {
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
    public PortfolioTransfer7 setTrfId(String value) {
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
    public PortfolioTransfer7 setTrfConfId(String value) {
        this.trfConfId = value;
        return this;
    }

    /**
     * Gets the value of the prtfl property.
     * 
     * @return
     *     possible object is
     *     {@link FundPortfolio5Choice }
     *     
     */
    public FundPortfolio5Choice getPrtfl() {
        return prtfl;
    }

    /**
     * Sets the value of the prtfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundPortfolio5Choice }
     *     
     */
    public PortfolioTransfer7 setPrtfl(FundPortfolio5Choice value) {
        this.prtfl = value;
        return this;
    }

    /**
     * Gets the value of the prtlDscvry property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrtlDscvry() {
        return prtlDscvry;
    }

    /**
     * Sets the value of the prtlDscvry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PortfolioTransfer7 setPrtlDscvry(Boolean value) {
        this.prtlDscvry = value;
        return this;
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
     * {@link ResidualCash1 }
     * 
     * 
     * @return
     *     The value of the rsdlCsh property.
     */
    public List<ResidualCash1> getRsdlCsh() {
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
    public PortfolioTransfer7 setTaxDt(LocalDate value) {
        this.taxDt = value;
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
     * {@link FinancialInstrument85 }
     * 
     * 
     * @return
     *     The value of the finInstrmAsstForTrf property.
     */
    public List<FinancialInstrument85> getFinInstrmAsstForTrf() {
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
     * Adds a new item to the rsdlCsh list.
     * @see #getRsdlCsh()
     * 
     */
    public PortfolioTransfer7 addRsdlCsh(ResidualCash1 rsdlCsh) {
        getRsdlCsh().add(rsdlCsh);
        return this;
    }

    /**
     * Adds a new item to the finInstrmAsstForTrf list.
     * @see #getFinInstrmAsstForTrf()
     * 
     */
    public PortfolioTransfer7 addFinInstrmAsstForTrf(FinancialInstrument85 finInstrmAsstForTrf) {
        getFinInstrmAsstForTrf().add(finInstrmAsstForTrf);
        return this;
    }

    /**
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public PortfolioTransfer7 addAddtlInf(AdditionalInformation15 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
