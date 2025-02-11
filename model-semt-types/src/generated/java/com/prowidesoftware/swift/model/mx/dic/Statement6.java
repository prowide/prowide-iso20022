
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * General characteristics related to a statement which reports information for a precise date.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Statement6", propOrder = {
    "ref",
    "stmtDtTm",
    "creDtTm",
    "frqcy",
    "updTp",
    "actvtyInd",
    "stmtBsis",
    "rptNb",
    "audtdInd"
})
public class Statement6 {

    @XmlElement(name = "Ref", required = true)
    protected String ref;
    @XmlElement(name = "StmtDtTm", required = true)
    protected DateAndDateTimeChoice stmtDtTm;
    @XmlElement(name = "CreDtTm")
    protected DateAndDateTimeChoice creDtTm;
    @XmlElement(name = "Frqcy", required = true)
    protected FrequencyCodeAndDSSCode1Choice frqcy;
    @XmlElement(name = "UpdTp", required = true)
    protected StatementUpdateTypeCodeAndDSSCodeChoice updTp;
    @XmlElement(name = "ActvtyInd")
    protected boolean actvtyInd;
    @XmlElement(name = "StmtBsis", required = true)
    protected StatementBasisCodeAndDSSCodeChoice stmtBsis;
    @XmlElement(name = "RptNb")
    protected String rptNb;
    @XmlElement(name = "AudtdInd")
    protected boolean audtdInd;

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Statement6 setRef(String value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the stmtDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getStmtDtTm() {
        return stmtDtTm;
    }

    /**
     * Sets the value of the stmtDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public Statement6 setStmtDtTm(DateAndDateTimeChoice value) {
        this.stmtDtTm = value;
        return this;
    }

    /**
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public Statement6 setCreDtTm(DateAndDateTimeChoice value) {
        this.creDtTm = value;
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
    public Statement6 setFrqcy(FrequencyCodeAndDSSCode1Choice value) {
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
    public Statement6 setUpdTp(StatementUpdateTypeCodeAndDSSCodeChoice value) {
        this.updTp = value;
        return this;
    }

    /**
     * Gets the value of the actvtyInd property.
     * 
     */
    public boolean isActvtyInd() {
        return actvtyInd;
    }

    /**
     * Sets the value of the actvtyInd property.
     * 
     */
    public Statement6 setActvtyInd(boolean value) {
        this.actvtyInd = value;
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
    public Statement6 setStmtBsis(StatementBasisCodeAndDSSCodeChoice value) {
        this.stmtBsis = value;
        return this;
    }

    /**
     * Gets the value of the rptNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptNb() {
        return rptNb;
    }

    /**
     * Sets the value of the rptNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Statement6 setRptNb(String value) {
        this.rptNb = value;
        return this;
    }

    /**
     * Gets the value of the audtdInd property.
     * 
     */
    public boolean isAudtdInd() {
        return audtdInd;
    }

    /**
     * Sets the value of the audtdInd property.
     * 
     */
    public Statement6 setAudtdInd(boolean value) {
        this.audtdInd = value;
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
