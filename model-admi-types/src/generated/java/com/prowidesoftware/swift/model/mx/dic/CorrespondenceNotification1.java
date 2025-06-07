
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the details of a notification, including identification and type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorrespondenceNotification1", propOrder = {
    "sndrNtfctnId",
    "ntfctnTp",
    "ntfctnSubTp",
    "ntfctnNrrtv",
    "nclsdFile",
    "rltdNtfctnData"
})
public class CorrespondenceNotification1 {

    @XmlElement(name = "SndrNtfctnId", required = true)
    protected String sndrNtfctnId;
    @XmlElement(name = "NtfctnTp", required = true)
    protected NotificationType1Choice ntfctnTp;
    @XmlElement(name = "NtfctnSubTp")
    protected NotificationSubType1Choice ntfctnSubTp;
    @XmlElement(name = "NtfctnNrrtv")
    protected List<String> ntfctnNrrtv;
    @XmlElement(name = "NclsdFile")
    protected List<Document15> nclsdFile;
    @XmlElement(name = "RltdNtfctnData")
    protected List<RelatedNotificationData1> rltdNtfctnData;

    /**
     * Gets the value of the sndrNtfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndrNtfctnId() {
        return sndrNtfctnId;
    }

    /**
     * Sets the value of the sndrNtfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorrespondenceNotification1 setSndrNtfctnId(String value) {
        this.sndrNtfctnId = value;
        return this;
    }

    /**
     * Gets the value of the ntfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationType1Choice }
     *     
     */
    public NotificationType1Choice getNtfctnTp() {
        return ntfctnTp;
    }

    /**
     * Sets the value of the ntfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationType1Choice }
     *     
     */
    public CorrespondenceNotification1 setNtfctnTp(NotificationType1Choice value) {
        this.ntfctnTp = value;
        return this;
    }

    /**
     * Gets the value of the ntfctnSubTp property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationSubType1Choice }
     *     
     */
    public NotificationSubType1Choice getNtfctnSubTp() {
        return ntfctnSubTp;
    }

    /**
     * Sets the value of the ntfctnSubTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationSubType1Choice }
     *     
     */
    public CorrespondenceNotification1 setNtfctnSubTp(NotificationSubType1Choice value) {
        this.ntfctnSubTp = value;
        return this;
    }

    /**
     * Gets the value of the ntfctnNrrtv property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ntfctnNrrtv property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtfctnNrrtv().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNtfctnNrrtv() {
        if (ntfctnNrrtv == null) {
            ntfctnNrrtv = new ArrayList<String>();
        }
        return this.ntfctnNrrtv;
    }

    /**
     * Gets the value of the nclsdFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nclsdFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNclsdFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Document15 }
     * 
     * 
     */
    public List<Document15> getNclsdFile() {
        if (nclsdFile == null) {
            nclsdFile = new ArrayList<Document15>();
        }
        return this.nclsdFile;
    }

    /**
     * Gets the value of the rltdNtfctnData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rltdNtfctnData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdNtfctnData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedNotificationData1 }
     * 
     * 
     */
    public List<RelatedNotificationData1> getRltdNtfctnData() {
        if (rltdNtfctnData == null) {
            rltdNtfctnData = new ArrayList<RelatedNotificationData1>();
        }
        return this.rltdNtfctnData;
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
     * Adds a new item to the ntfctnNrrtv list.
     * @see #getNtfctnNrrtv()
     * 
     */
    public CorrespondenceNotification1 addNtfctnNrrtv(String ntfctnNrrtv) {
        getNtfctnNrrtv().add(ntfctnNrrtv);
        return this;
    }

    /**
     * Adds a new item to the nclsdFile list.
     * @see #getNclsdFile()
     * 
     */
    public CorrespondenceNotification1 addNclsdFile(Document15 nclsdFile) {
        getNclsdFile().add(nclsdFile);
        return this;
    }

    /**
     * Adds a new item to the rltdNtfctnData list.
     * @see #getRltdNtfctnData()
     * 
     */
    public CorrespondenceNotification1 addRltdNtfctnData(RelatedNotificationData1 rltdNtfctnData) {
        getRltdNtfctnData().add(rltdNtfctnData);
        return this;
    }

}
