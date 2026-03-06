
package com.prowidesoftware.swift.model.mx.sys.dic;

import java.math.BigDecimal;
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
 * CopyStatus
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CopyStatus", propOrder = {
    "svc",
    "tmRg",
    "cntrPndgCp",
    "cntrCpdPndgAuth",
    "msgList",
    "refList"
})
public class CopyStatus {

    @XmlElement(name = "Svc", required = true)
    protected String svc;
    @XmlElement(name = "TmRg", required = true)
    protected CopyStatus.TmRg tmRg;
    @XmlElement(name = "CntrPndgCp")
    protected BigDecimal cntrPndgCp;
    @XmlElement(name = "CntrCpdPndgAuth")
    protected BigDecimal cntrCpdPndgAuth;
    @XmlElement(name = "MsgList")
    protected MessageListXsys025 msgList;
    @XmlElement(name = "RefList")
    protected ReferenceList refList;

    /**
     * Gets the value of the svc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvc() {
        return svc;
    }

    /**
     * Sets the value of the svc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CopyStatus setSvc(String value) {
        this.svc = value;
        return this;
    }

    /**
     * Gets the value of the tmRg property.
     * 
     * @return
     *     possible object is
     *     {@link CopyStatus.TmRg }
     *     
     */
    public CopyStatus.TmRg getTmRg() {
        return tmRg;
    }

    /**
     * Sets the value of the tmRg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CopyStatus.TmRg }
     *     
     */
    public CopyStatus setTmRg(CopyStatus.TmRg value) {
        this.tmRg = value;
        return this;
    }

    /**
     * Gets the value of the cntrPndgCp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCntrPndgCp() {
        return cntrPndgCp;
    }

    /**
     * Sets the value of the cntrPndgCp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CopyStatus setCntrPndgCp(BigDecimal value) {
        this.cntrPndgCp = value;
        return this;
    }

    /**
     * Gets the value of the cntrCpdPndgAuth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCntrCpdPndgAuth() {
        return cntrCpdPndgAuth;
    }

    /**
     * Sets the value of the cntrCpdPndgAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CopyStatus setCntrCpdPndgAuth(BigDecimal value) {
        this.cntrCpdPndgAuth = value;
        return this;
    }

    /**
     * Gets the value of the msgList property.
     * 
     * @return
     *     possible object is
     *     {@link MessageListXsys025 }
     *     
     */
    public MessageListXsys025 getMsgList() {
        return msgList;
    }

    /**
     * Sets the value of the msgList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageListXsys025 }
     *     
     */
    public CopyStatus setMsgList(MessageListXsys025 value) {
        this.msgList = value;
        return this;
    }

    /**
     * Gets the value of the refList property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceList }
     *     
     */
    public ReferenceList getRefList() {
        return refList;
    }

    /**
     * Sets the value of the refList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceList }
     *     
     */
    public CopyStatus setRefList(ReferenceList value) {
        this.refList = value;
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
     * Java class for anonymous complex type.
     * 
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "frTm",
        "toTm"
    })
    public static class TmRg {

        @XmlElement(name = "FrTm", required = true, type = String.class)
        @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
        @XmlSchemaType(name = "dateTime")
        protected OffsetDateTime frTm;
        @XmlElement(name = "ToTm", required = true, type = String.class)
        @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
        @XmlSchemaType(name = "dateTime")
        protected OffsetDateTime toTm;

        /**
         * Gets the value of the frTm property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public OffsetDateTime getFrTm() {
            return frTm;
        }

        /**
         * Sets the value of the frTm property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public CopyStatus.TmRg setFrTm(OffsetDateTime value) {
            this.frTm = value;
            return this;
        }

        /**
         * Gets the value of the toTm property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public OffsetDateTime getToTm() {
            return toTm;
        }

        /**
         * Sets the value of the toTm property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public CopyStatus.TmRg setToTm(OffsetDateTime value) {
            this.toTm = value;
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

}
