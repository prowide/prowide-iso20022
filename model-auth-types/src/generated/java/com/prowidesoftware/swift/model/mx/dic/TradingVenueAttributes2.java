
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetDateTime;
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
 * Traded venue related fields.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradingVenueAttributes2", propOrder = {
    "id",
    "issrReq",
    "admssnApprvlDtByIssr",
    "reqForAdmssnDt",
    "frstTradDt",
    "termntnDt"
})
public class TradingVenueAttributes2 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "IssrReq")
    protected Boolean issrReq;
    @XmlElement(name = "AdmssnApprvlDtByIssr", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime admssnApprvlDtByIssr;
    @XmlElement(name = "ReqForAdmssnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime reqForAdmssnDt;
    @XmlElement(name = "FrstTradDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime frstTradDt;
    @XmlElement(name = "TermntnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime termntnDt;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradingVenueAttributes2 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the issrReq property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIssrReq() {
        return issrReq;
    }

    /**
     * Sets the value of the issrReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public TradingVenueAttributes2 setIssrReq(Boolean value) {
        this.issrReq = value;
        return this;
    }

    /**
     * Gets the value of the admssnApprvlDtByIssr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getAdmssnApprvlDtByIssr() {
        return admssnApprvlDtByIssr;
    }

    /**
     * Sets the value of the admssnApprvlDtByIssr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradingVenueAttributes2 setAdmssnApprvlDtByIssr(OffsetDateTime value) {
        this.admssnApprvlDtByIssr = value;
        return this;
    }

    /**
     * Gets the value of the reqForAdmssnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getReqForAdmssnDt() {
        return reqForAdmssnDt;
    }

    /**
     * Sets the value of the reqForAdmssnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradingVenueAttributes2 setReqForAdmssnDt(OffsetDateTime value) {
        this.reqForAdmssnDt = value;
        return this;
    }

    /**
     * Gets the value of the frstTradDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getFrstTradDt() {
        return frstTradDt;
    }

    /**
     * Sets the value of the frstTradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradingVenueAttributes2 setFrstTradDt(OffsetDateTime value) {
        this.frstTradDt = value;
        return this;
    }

    /**
     * Gets the value of the termntnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getTermntnDt() {
        return termntnDt;
    }

    /**
     * Sets the value of the termntnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradingVenueAttributes2 setTermntnDt(OffsetDateTime value) {
        this.termntnDt = value;
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
