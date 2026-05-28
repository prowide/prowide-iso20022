
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
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
 * Funds related service such as a payment or a transfer related to the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundingService4", propOrder = {
    "prvdr",
    "nm",
    "ref",
    "bizPurp",
    "desc",
    "fndgSrc",
    "clmCrdntls",
    "clmAssgnr",
    "svcPrcgTp",
    "dfrrdDtTm"
})
public class FundingService4 {

    @XmlElement(name = "Prvdr")
    protected String prvdr;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Ref")
    protected String ref;
    @XmlElement(name = "BizPurp")
    protected String bizPurp;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "FndgSrc")
    protected List<FundingSource5> fndgSrc;
    @XmlElement(name = "ClmCrdntls")
    protected String clmCrdntls;
    @XmlElement(name = "ClmAssgnr")
    protected String clmAssgnr;
    @XmlElement(name = "SvcPrcgTp")
    protected String svcPrcgTp;
    @XmlElement(name = "DfrrdDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime dfrrdDtTm;

    /**
     * Gets the value of the prvdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvdr() {
        return prvdr;
    }

    /**
     * Sets the value of the prvdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FundingService4 setPrvdr(String value) {
        this.prvdr = value;
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
    public FundingService4 setNm(String value) {
        this.nm = value;
        return this;
    }

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
    public FundingService4 setRef(String value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the bizPurp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizPurp() {
        return bizPurp;
    }

    /**
     * Sets the value of the bizPurp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FundingService4 setBizPurp(String value) {
        this.bizPurp = value;
        return this;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FundingService4 setDesc(String value) {
        this.desc = value;
        return this;
    }

    /**
     * Gets the value of the fndgSrc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fndgSrc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFndgSrc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FundingSource5 }
     * 
     * 
     * @return
     *     The value of the fndgSrc property.
     */
    public List<FundingSource5> getFndgSrc() {
        if (fndgSrc == null) {
            fndgSrc = new ArrayList<>();
        }
        return this.fndgSrc;
    }

    /**
     * Gets the value of the clmCrdntls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClmCrdntls() {
        return clmCrdntls;
    }

    /**
     * Sets the value of the clmCrdntls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FundingService4 setClmCrdntls(String value) {
        this.clmCrdntls = value;
        return this;
    }

    /**
     * Gets the value of the clmAssgnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClmAssgnr() {
        return clmAssgnr;
    }

    /**
     * Sets the value of the clmAssgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FundingService4 setClmAssgnr(String value) {
        this.clmAssgnr = value;
        return this;
    }

    /**
     * Gets the value of the svcPrcgTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcPrcgTp() {
        return svcPrcgTp;
    }

    /**
     * Sets the value of the svcPrcgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FundingService4 setSvcPrcgTp(String value) {
        this.svcPrcgTp = value;
        return this;
    }

    /**
     * Gets the value of the dfrrdDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getDfrrdDtTm() {
        return dfrrdDtTm;
    }

    /**
     * Sets the value of the dfrrdDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FundingService4 setDfrrdDtTm(OffsetDateTime value) {
        this.dfrrdDtTm = value;
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
     * Adds a new item to the fndgSrc list.
     * @see #getFndgSrc()
     * 
     */
    public FundingService4 addFndgSrc(FundingSource5 fndgSrc) {
        getFndgSrc().add(fndgSrc);
        return this;
    }

}
