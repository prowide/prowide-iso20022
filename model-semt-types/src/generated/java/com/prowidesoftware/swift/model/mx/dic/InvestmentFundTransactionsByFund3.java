
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
 * Investment fund transactions for a specific financial instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentFundTransactionsByFund3", propOrder = {
    "id",
    "nm",
    "splmtryId",
    "sctiesForm",
    "clssTp",
    "dstrbtnPlcy",
    "txDtls",
    "balByPg"
})
public class InvestmentFundTransactionsByFund3 {

    @XmlElement(name = "Id", required = true)
    protected SecurityIdentification3Choice id;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "SplmtryId")
    protected String splmtryId;
    @XmlElement(name = "SctiesForm")
    @XmlSchemaType(name = "string")
    protected FormOfSecurity1Code sctiesForm;
    @XmlElement(name = "ClssTp")
    protected String clssTp;
    @XmlElement(name = "DstrbtnPlcy")
    @XmlSchemaType(name = "string")
    protected DistributionPolicy1Code dstrbtnPlcy;
    @XmlElement(name = "TxDtls", required = true)
    protected List<InvestmentFundTransaction4> txDtls;
    @XmlElement(name = "BalByPg")
    protected PaginationBalance2 balByPg;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification3Choice }
     *     
     */
    public SecurityIdentification3Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification3Choice }
     *     
     */
    public InvestmentFundTransactionsByFund3 setId(SecurityIdentification3Choice value) {
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
    public InvestmentFundTransactionsByFund3 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the splmtryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSplmtryId() {
        return splmtryId;
    }

    /**
     * Sets the value of the splmtryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentFundTransactionsByFund3 setSplmtryId(String value) {
        this.splmtryId = value;
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
    public InvestmentFundTransactionsByFund3 setSctiesForm(FormOfSecurity1Code value) {
        this.sctiesForm = value;
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
    public InvestmentFundTransactionsByFund3 setClssTp(String value) {
        this.clssTp = value;
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
    public InvestmentFundTransactionsByFund3 setDstrbtnPlcy(DistributionPolicy1Code value) {
        this.dstrbtnPlcy = value;
        return this;
    }

    /**
     * Gets the value of the txDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentFundTransaction4 }
     * 
     * 
     * @return
     *     The value of the txDtls property.
     */
    public List<InvestmentFundTransaction4> getTxDtls() {
        if (txDtls == null) {
            txDtls = new ArrayList<>();
        }
        return this.txDtls;
    }

    /**
     * Gets the value of the balByPg property.
     * 
     * @return
     *     possible object is
     *     {@link PaginationBalance2 }
     *     
     */
    public PaginationBalance2 getBalByPg() {
        return balByPg;
    }

    /**
     * Sets the value of the balByPg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginationBalance2 }
     *     
     */
    public InvestmentFundTransactionsByFund3 setBalByPg(PaginationBalance2 value) {
        this.balByPg = value;
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
     * Adds a new item to the txDtls list.
     * @see #getTxDtls()
     * 
     */
    public InvestmentFundTransactionsByFund3 addTxDtls(InvestmentFundTransaction4 txDtls) {
        getTxDtls().add(txDtls);
        return this;
    }

}
