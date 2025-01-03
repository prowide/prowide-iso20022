
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
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
 * Extract of trade data for an investment fund order.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundOrderData3", propOrder = {
    "reqdTradDt",
    "invstmtAcctDtls",
    "finInstrmDtls",
    "finInstrmQty"
})
public class FundOrderData3 {

    @XmlElement(name = "ReqdTradDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate reqdTradDt;
    @XmlElement(name = "InvstmtAcctDtls")
    protected InvestmentAccount30 invstmtAcctDtls;
    @XmlElement(name = "FinInstrmDtls")
    protected FinancialInstrument18 finInstrmDtls;
    @XmlElement(name = "FinInstrmQty")
    protected FinancialInstrumentQuantity11Choice finInstrmQty;

    /**
     * Gets the value of the reqdTradDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getReqdTradDt() {
        return reqdTradDt;
    }

    /**
     * Sets the value of the reqdTradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FundOrderData3 setReqdTradDt(LocalDate value) {
        this.reqdTradDt = value;
        return this;
    }

    /**
     * Gets the value of the invstmtAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount30 }
     *     
     */
    public InvestmentAccount30 getInvstmtAcctDtls() {
        return invstmtAcctDtls;
    }

    /**
     * Sets the value of the invstmtAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount30 }
     *     
     */
    public FundOrderData3 setInvstmtAcctDtls(InvestmentAccount30 value) {
        this.invstmtAcctDtls = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument18 }
     *     
     */
    public FinancialInstrument18 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument18 }
     *     
     */
    public FundOrderData3 setFinInstrmDtls(FinancialInstrument18 value) {
        this.finInstrmDtls = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity11Choice }
     *     
     */
    public FinancialInstrumentQuantity11Choice getFinInstrmQty() {
        return finInstrmQty;
    }

    /**
     * Sets the value of the finInstrmQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity11Choice }
     *     
     */
    public FundOrderData3 setFinInstrmQty(FinancialInstrumentQuantity11Choice value) {
        this.finInstrmQty = value;
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
