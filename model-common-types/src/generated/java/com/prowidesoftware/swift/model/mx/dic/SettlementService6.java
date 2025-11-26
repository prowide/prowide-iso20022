
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import com.prowidesoftware.swift.model.mx.adapters.IsoTimeAdapter;
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
 * Attributes of a settlement service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementService6", propOrder = {
    "tp",
    "id",
    "reqdDt",
    "dfrrd",
    "dt",
    "tm",
    "prd",
    "cutOffTm",
    "rptgNttyTp",
    "rptgNttyId",
    "addtlInf"
})
public class SettlementService6 {

    @XmlElement(name = "Tp")
    protected String tp;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "ReqdDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate reqdDt;
    @XmlElement(name = "Dfrrd")
    protected Boolean dfrrd;
    @XmlElement(name = "Dt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dt;
    @XmlElement(name = "Tm", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected OffsetTime tm;
    @XmlElement(name = "Prd")
    protected String prd;
    @XmlElement(name = "CutOffTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime cutOffTm;
    @XmlElement(name = "RptgNttyTp")
    protected String rptgNttyTp;
    @XmlElement(name = "RptgNttyId")
    protected String rptgNttyId;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalData1> addtlInf;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementService6 setTp(String value) {
        this.tp = value;
        return this;
    }

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
    public SettlementService6 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the reqdDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getReqdDt() {
        return reqdDt;
    }

    /**
     * Sets the value of the reqdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementService6 setReqdDt(LocalDate value) {
        this.reqdDt = value;
        return this;
    }

    /**
     * Gets the value of the dfrrd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDfrrd() {
        return dfrrd;
    }

    /**
     * Sets the value of the dfrrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SettlementService6 setDfrrd(Boolean value) {
        this.dfrrd = value;
        return this;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementService6 setDt(LocalDate value) {
        this.dt = value;
        return this;
    }

    /**
     * Gets the value of the tm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetTime getTm() {
        return tm;
    }

    /**
     * Sets the value of the tm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementService6 setTm(OffsetTime value) {
        this.tm = value;
        return this;
    }

    /**
     * Gets the value of the prd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrd() {
        return prd;
    }

    /**
     * Sets the value of the prd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementService6 setPrd(String value) {
        this.prd = value;
        return this;
    }

    /**
     * Gets the value of the cutOffTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getCutOffTm() {
        return cutOffTm;
    }

    /**
     * Sets the value of the cutOffTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementService6 setCutOffTm(OffsetDateTime value) {
        this.cutOffTm = value;
        return this;
    }

    /**
     * Gets the value of the rptgNttyTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptgNttyTp() {
        return rptgNttyTp;
    }

    /**
     * Sets the value of the rptgNttyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementService6 setRptgNttyTp(String value) {
        this.rptgNttyTp = value;
        return this;
    }

    /**
     * Gets the value of the rptgNttyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptgNttyId() {
        return rptgNttyId;
    }

    /**
     * Sets the value of the rptgNttyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementService6 setRptgNttyId(String value) {
        this.rptgNttyId = value;
        return this;
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
     * {@link AdditionalData1 }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditionalData1> getAddtlInf() {
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
     * Adds a new item to the addtlInf list.
     * @see #getAddtlInf()
     * 
     */
    public SettlementService6 addAddtlInf(AdditionalData1 addtlInf) {
        getAddtlInf().add(addtlInf);
        return this;
    }

}
