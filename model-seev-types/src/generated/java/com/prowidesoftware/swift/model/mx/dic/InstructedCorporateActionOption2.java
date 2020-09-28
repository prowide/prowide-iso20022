
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
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
@XmlType(name = "InstructedCorporateActionOption2", propOrder = {
    "optnNb",
    "optnTp",
    "instdBal",
    "dfltActn",
    "ddlnDtTm",
    "ddlnTp"
})
public class InstructedCorporateActionOption2 {

    @XmlElement(name = "OptnNb")
    protected String optnNb;
    @XmlElement(name = "OptnTp", required = true)
    protected CorporateActionOption9Choice optnTp;
    @XmlElement(name = "InstdBal", required = true)
    protected BalanceFormat2Choice instdBal;
    @XmlElement(name = "DfltActn")
    protected DefaultProcessingOrStandingInstruction1Choice dfltActn;
    @XmlElement(name = "DdlnDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ddlnDtTm;
    @XmlElement(name = "DdlnTp", required = true)
    protected DeadlineCode2Choice ddlnTp;

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
    public InstructedCorporateActionOption2 setOptnNb(String value) {
        this.optnNb = value;
        return this;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption9Choice }
     *     
     */
    public CorporateActionOption9Choice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption9Choice }
     *     
     */
    public InstructedCorporateActionOption2 setOptnTp(CorporateActionOption9Choice value) {
        this.optnTp = value;
        return this;
    }

    /**
     * Gets the value of the instdBal property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceFormat2Choice }
     *     
     */
    public BalanceFormat2Choice getInstdBal() {
        return instdBal;
    }

    /**
     * Sets the value of the instdBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceFormat2Choice }
     *     
     */
    public InstructedCorporateActionOption2 setInstdBal(BalanceFormat2Choice value) {
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
    public InstructedCorporateActionOption2 setDfltActn(DefaultProcessingOrStandingInstruction1Choice value) {
        this.dfltActn = value;
        return this;
    }

    /**
     * Gets the value of the ddlnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDdlnDtTm() {
        return ddlnDtTm;
    }

    /**
     * Sets the value of the ddlnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public InstructedCorporateActionOption2 setDdlnDtTm(XMLGregorianCalendar value) {
        this.ddlnDtTm = value;
        return this;
    }

    /**
     * Gets the value of the ddlnTp property.
     * 
     * @return
     *     possible object is
     *     {@link DeadlineCode2Choice }
     *     
     */
    public DeadlineCode2Choice getDdlnTp() {
        return ddlnTp;
    }

    /**
     * Sets the value of the ddlnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeadlineCode2Choice }
     *     
     */
    public InstructedCorporateActionOption2 setDdlnTp(DeadlineCode2Choice value) {
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
