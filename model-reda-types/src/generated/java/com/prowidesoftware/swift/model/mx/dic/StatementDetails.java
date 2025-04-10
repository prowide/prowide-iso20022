
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
 * Account and statement parameters for which a statement is requested.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatementDetails", propOrder = {
    "acctId",
    "subAcctId",
    "acctOwnr",
    "stmtTp",
    "xtndedStmtTp",
    "stmtDt",
    "stmtPrd",
    "frqcy",
    "updTp",
    "stmtBsis"
})
public class StatementDetails {

    @XmlElement(name = "AcctId", required = true)
    protected AccountIdentificationFormatChoice acctId;
    @XmlElement(name = "SubAcctId")
    protected AccountIdentificationFormatChoice subAcctId;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification2Choice acctOwnr;
    @XmlElement(name = "StmtTp")
    @XmlSchemaType(name = "string")
    protected StatementType1Code stmtTp;
    @XmlElement(name = "XtndedStmtTp")
    protected String xtndedStmtTp;
    @XmlElement(name = "StmtDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate stmtDt;
    @XmlElement(name = "StmtPrd")
    protected DatePeriodDetails stmtPrd;
    @XmlElement(name = "Frqcy")
    protected FrequencyCodeAndDSSCode1Choice frqcy;
    @XmlElement(name = "UpdTp")
    protected StatementUpdateTypeCodeAndDSSCodeChoice updTp;
    @XmlElement(name = "StmtBsis")
    protected StatementBasisCodeAndDSSCodeChoice stmtBsis;

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationFormatChoice }
     *     
     */
    public AccountIdentificationFormatChoice getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationFormatChoice }
     *     
     */
    public StatementDetails setAcctId(AccountIdentificationFormatChoice value) {
        this.acctId = value;
        return this;
    }

    /**
     * Gets the value of the subAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationFormatChoice }
     *     
     */
    public AccountIdentificationFormatChoice getSubAcctId() {
        return subAcctId;
    }

    /**
     * Sets the value of the subAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationFormatChoice }
     *     
     */
    public StatementDetails setSubAcctId(AccountIdentificationFormatChoice value) {
        this.subAcctId = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public StatementDetails setAcctOwnr(PartyIdentification2Choice value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the stmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link StatementType1Code }
     *     
     */
    public StatementType1Code getStmtTp() {
        return stmtTp;
    }

    /**
     * Sets the value of the stmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementType1Code }
     *     
     */
    public StatementDetails setStmtTp(StatementType1Code value) {
        this.stmtTp = value;
        return this;
    }

    /**
     * Gets the value of the xtndedStmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedStmtTp() {
        return xtndedStmtTp;
    }

    /**
     * Sets the value of the xtndedStmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StatementDetails setXtndedStmtTp(String value) {
        this.xtndedStmtTp = value;
        return this;
    }

    /**
     * Gets the value of the stmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getStmtDt() {
        return stmtDt;
    }

    /**
     * Sets the value of the stmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public StatementDetails setStmtDt(LocalDate value) {
        this.stmtDt = value;
        return this;
    }

    /**
     * Gets the value of the stmtPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodDetails }
     *     
     */
    public DatePeriodDetails getStmtPrd() {
        return stmtPrd;
    }

    /**
     * Sets the value of the stmtPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodDetails }
     *     
     */
    public StatementDetails setStmtPrd(DatePeriodDetails value) {
        this.stmtPrd = value;
        return this;
    }

    /**
     * Gets the value of the frqcy property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyCodeAndDSSCode1Choice }
     *     
     */
    public FrequencyCodeAndDSSCode1Choice getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyCodeAndDSSCode1Choice }
     *     
     */
    public StatementDetails setFrqcy(FrequencyCodeAndDSSCode1Choice value) {
        this.frqcy = value;
        return this;
    }

    /**
     * Gets the value of the updTp property.
     * 
     * @return
     *     possible object is
     *     {@link StatementUpdateTypeCodeAndDSSCodeChoice }
     *     
     */
    public StatementUpdateTypeCodeAndDSSCodeChoice getUpdTp() {
        return updTp;
    }

    /**
     * Sets the value of the updTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementUpdateTypeCodeAndDSSCodeChoice }
     *     
     */
    public StatementDetails setUpdTp(StatementUpdateTypeCodeAndDSSCodeChoice value) {
        this.updTp = value;
        return this;
    }

    /**
     * Gets the value of the stmtBsis property.
     * 
     * @return
     *     possible object is
     *     {@link StatementBasisCodeAndDSSCodeChoice }
     *     
     */
    public StatementBasisCodeAndDSSCodeChoice getStmtBsis() {
        return stmtBsis;
    }

    /**
     * Sets the value of the stmtBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementBasisCodeAndDSSCodeChoice }
     *     
     */
    public StatementDetails setStmtBsis(StatementBasisCodeAndDSSCodeChoice value) {
        this.stmtBsis = value;
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
