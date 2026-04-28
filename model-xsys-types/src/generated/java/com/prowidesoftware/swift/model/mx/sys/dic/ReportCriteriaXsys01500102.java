
package com.prowidesoftware.swift.model.mx.sys.dic;

import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for ReportCriteria complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportCriteria", propOrder = {
    "rprtGnrtnOptn",
    "rtrvlScp",
    "queue",
    "frTm",
    "snglMsgCrit",
    "mltplMsgCrit"
})
public class ReportCriteriaXsys01500102 {

    @XmlElement(name = "RprtGnrtnOptn", required = true)
    protected String rprtGnrtnOptn;
    @XmlElement(name = "RtrvlScp")
    protected String rtrvlScp;
    @XmlElement(name = "Queue", namespace = "urn:swift:snl:ns.SwInt", required = true)
    protected String queue;
    @XmlElement(name = "FrTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar frTm;
    @XmlElement(name = "SnglMsgCrit")
    protected SingleMessageCriteria snglMsgCrit;
    @XmlElement(name = "MltplMsgCrit")
    protected MultipleMessageCriteria mltplMsgCrit;

    /**
     * Gets the value of the rprtGnrtnOptn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRprtGnrtnOptn() {
        return rprtGnrtnOptn;
    }

    /**
     * Sets the value of the rprtGnrtnOptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportCriteriaXsys01500102 setRprtGnrtnOptn(String value) {
        this.rprtGnrtnOptn = value;
        return this;
    }

    /**
     * Gets the value of the rtrvlScp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtrvlScp() {
        return rtrvlScp;
    }

    /**
     * Sets the value of the rtrvlScp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportCriteriaXsys01500102 setRtrvlScp(String value) {
        this.rtrvlScp = value;
        return this;
    }

    /**
     * Queue
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueue() {
        return queue;
    }

    /**
     * Sets the value of the queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportCriteriaXsys01500102 setQueue(String value) {
        this.queue = value;
        return this;
    }

    /**
     * Gets the value of the frTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getFrTm() {
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
    public ReportCriteriaXsys01500102 setFrTm(XMLGregorianCalendar value) {
        this.frTm = value;
        return this;
    }

    /**
     * Gets the value of the snglMsgCrit property.
     * 
     * @return
     *     possible object is
     *     {@link SingleMessageCriteria }
     *     
     */
    public SingleMessageCriteria getSnglMsgCrit() {
        return snglMsgCrit;
    }

    /**
     * Sets the value of the snglMsgCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleMessageCriteria }
     *     
     */
    public ReportCriteriaXsys01500102 setSnglMsgCrit(SingleMessageCriteria value) {
        this.snglMsgCrit = value;
        return this;
    }

    /**
     * Gets the value of the mltplMsgCrit property.
     * 
     * @return
     *     possible object is
     *     {@link MultipleMessageCriteria }
     *     
     */
    public MultipleMessageCriteria getMltplMsgCrit() {
        return mltplMsgCrit;
    }

    /**
     * Sets the value of the mltplMsgCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleMessageCriteria }
     *     
     */
    public ReportCriteriaXsys01500102 setMltplMsgCrit(MultipleMessageCriteria value) {
        this.mltplMsgCrit = value;
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
