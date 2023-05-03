
package com.prowidesoftware.swift.model.mx.sys.dic;

import java.math.BigDecimal;
import java.time.OffsetDateTime ;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import com.prowidesoftware.swift.model.mx.sys.dic.SwDigest;
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
 * Java class for RetrievedBulkFile complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrievedBulkFile", propOrder = {
    "logicalName",
    "size",
    "digest",
    "firstSnFTm",
    "lastSnFTm",
    "ttlNbOfMsgs"
})
public class RetrievedBulkFile {

    @XmlElement(name = "LogicalName", namespace = "urn:swift:snl:ns.Sw", required = true)
    protected String logicalName;
    @XmlElement(name = "Size", namespace = "urn:swift:snl:ns.Sw", required = true)
    protected String size;
    @XmlElement(name = "Digest", namespace = "urn:swift:snl:ns.Sw", required = true)
    protected SwDigest digest;
    @XmlElement(name = "FirstSnFTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime firstSnFTm;
    @XmlElement(name = "LastSnFTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime lastSnFTm;
    @XmlElement(name = "TtlNbOfMsgs", required = true)
    protected BigDecimal ttlNbOfMsgs;

    /**
     * LogicalName
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogicalName() {
        return logicalName;
    }

    /**
     * Sets the value of the logicalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RetrievedBulkFile setLogicalName(String value) {
        this.logicalName = value;
        return this;
    }

    /**
     * Size
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RetrievedBulkFile setSize(String value) {
        this.size = value;
        return this;
    }

    /**
     * Digest
     * 
     * @return
     *     possible object is
     *     {@link SwDigest }
     *     
     */
    public SwDigest getDigest() {
        return digest;
    }

    /**
     * Sets the value of the digest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwDigest }
     *     
     */
    public RetrievedBulkFile setDigest(SwDigest value) {
        this.digest = value;
        return this;
    }

    /**
     * Gets the value of the firstSnFTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getFirstSnFTm() {
        return firstSnFTm;
    }

    /**
     * Sets the value of the firstSnFTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RetrievedBulkFile setFirstSnFTm(OffsetDateTime value) {
        this.firstSnFTm = value;
        return this;
    }

    /**
     * Gets the value of the lastSnFTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getLastSnFTm() {
        return lastSnFTm;
    }

    /**
     * Sets the value of the lastSnFTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RetrievedBulkFile setLastSnFTm(OffsetDateTime value) {
        this.lastSnFTm = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbOfMsgs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbOfMsgs() {
        return ttlNbOfMsgs;
    }

    /**
     * Sets the value of the ttlNbOfMsgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public RetrievedBulkFile setTtlNbOfMsgs(BigDecimal value) {
        this.ttlNbOfMsgs = value;
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
