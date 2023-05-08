
package com.prowidesoftware.swift.model.mx.dic;

import java.util.Calendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
 * Provides corporate action option details about total instructed balance.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstructedCorporateActionOption4", propOrder = {
    "optnNb",
    "optnTp",
    "instdBal",
    "dfltActn",
    "ddlnDtTm",
    "ddlnTp"
})
public class InstructedCorporateActionOption4 {

    @XmlElement(name = "OptnNb")
    protected String optnNb;
    @XmlElement(name = "OptnTp", required = true)
    protected CorporateActionOption10Choice optnTp;
    @XmlElement(name = "InstdBal", required = true)
    protected BalanceFormat1Choice instdBal;
    @XmlElement(name = "DfltActn")
    protected DefaultProcessingOrStandingInstruction1Choice dfltActn;
    @XmlElement(name = "DdlnDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar ddlnDtTm;
    @XmlElement(name = "DdlnTp", required = true)
    protected DeadlineCode1Choice ddlnTp;

    /**
     * Gets the value of the optnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptnNb() {
        return optnNb;
    }

    /**
     * Sets the value of the optnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InstructedCorporateActionOption4 setOptnNb(String value) {
        this.optnNb = value;
        return this;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption10Choice }
     *     
     */
    public CorporateActionOption10Choice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption10Choice }
     *     
     */
    public InstructedCorporateActionOption4 setOptnTp(CorporateActionOption10Choice value) {
        this.optnTp = value;
        return this;
    }

    /**
     * Gets the value of the instdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat1Choice }
     *     
     */
    public BalanceFormat1Choice getInstdBal() {
        return instdBal;
    }

    /**
     * Sets the value of the instdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat1Choice }
     *     
     */
    public InstructedCorporateActionOption4 setInstdBal(BalanceFormat1Choice value) {
        this.instdBal = value;
        return this;
    }

    /**
     * Gets the value of the dfltActn property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultProcessingOrStandingInstruction1Choice }
     *     
     */
    public DefaultProcessingOrStandingInstruction1Choice getDfltActn() {
        return dfltActn;
    }

    /**
     * Sets the value of the dfltActn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultProcessingOrStandingInstruction1Choice }
     *     
     */
    public InstructedCorporateActionOption4 setDfltActn(DefaultProcessingOrStandingInstruction1Choice value) {
        this.dfltActn = value;
        return this;
    }

    /**
     * Gets the value of the ddlnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDdlnDtTm() {
        return ddlnDtTm;
    }

    /**
     * Sets the value of the ddlnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InstructedCorporateActionOption4 setDdlnDtTm(Calendar value) {
        this.ddlnDtTm = value;
        return this;
    }

    /**
     * Gets the value of the ddlnTp property.
     * 
     * @return
     *     possible object is
     *     {@link DeadlineCode1Choice }
     *     
     */
    public DeadlineCode1Choice getDdlnTp() {
        return ddlnTp;
    }

    /**
     * Sets the value of the ddlnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeadlineCode1Choice }
     *     
     */
    public InstructedCorporateActionOption4 setDdlnTp(DeadlineCode1Choice value) {
        this.ddlnTp = value;
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
