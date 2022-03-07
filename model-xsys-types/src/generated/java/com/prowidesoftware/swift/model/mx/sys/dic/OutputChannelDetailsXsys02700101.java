
package com.prowidesoftware.swift.model.mx.sys.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for OutputChannelDetails complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputChannelDetails", propOrder = {
    "stat",
    "lastStatChngTm",
    "lastStatChngDN",
    "outputChannel",
    "queue",
    "shrMd",
    "snFSessionId",
    "ackPndng",
    "subset",
    "windowSize",
    "lastSnFOutputSeq"
})
public class OutputChannelDetailsXsys02700101 {

    @XmlElement(name = "Stat", required = true)
    protected String stat;
    @XmlElement(name = "LastStatChngTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastStatChngTm;
    @XmlElement(name = "LastStatChngDN", required = true)
    protected String lastStatChngDN;
    @XmlElement(name = "OutputChannel", namespace = "urn:swift:snl:ns.Sw", required = true)
    protected String outputChannel;
    @XmlElement(name = "Queue", namespace = "urn:swift:snl:ns.SwInt")
    protected String queue;
    @XmlElement(name = "ShrMd")
    protected String shrMd;
    @XmlElement(name = "SnFSessionId", namespace = "urn:swift:snl:ns.Sw")
    protected String snFSessionId;
    @XmlElement(name = "AckPndng")
    @XmlSchemaType(name = "string")
    protected SwBooleanIndicator ackPndng;
    @XmlElement(name = "Subset", namespace = "urn:swift:snl:ns.Sw")
    protected List<String> subset;
    @XmlElement(name = "WindowSize", namespace = "urn:swift:snl:ns.Sw")
    protected String windowSize;
    @XmlElement(name = "LastSnFOutputSeq", namespace = "urn:swift:snl:ns.Sw")
    protected String lastSnFOutputSeq;

    /**
     * Gets the value of the stat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStat() {
        return stat;
    }

    /**
     * Sets the value of the stat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OutputChannelDetailsXsys02700101 setStat(String value) {
        this.stat = value;
        return this;
    }

    /**
     * Gets the value of the lastStatChngTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getLastStatChngTm() {
        return lastStatChngTm;
    }

    /**
     * Sets the value of the lastStatChngTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OutputChannelDetailsXsys02700101 setLastStatChngTm(XMLGregorianCalendar value) {
        this.lastStatChngTm = value;
        return this;
    }

    /**
     * Gets the value of the lastStatChngDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastStatChngDN() {
        return lastStatChngDN;
    }

    /**
     * Sets the value of the lastStatChngDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OutputChannelDetailsXsys02700101 setLastStatChngDN(String value) {
        this.lastStatChngDN = value;
        return this;
    }

    /**
     * OutputChannel
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputChannel() {
        return outputChannel;
    }

    /**
     * Sets the value of the outputChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OutputChannelDetailsXsys02700101 setOutputChannel(String value) {
        this.outputChannel = value;
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
    public OutputChannelDetailsXsys02700101 setQueue(String value) {
        this.queue = value;
        return this;
    }

    /**
     * Gets the value of the shrMd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShrMd() {
        return shrMd;
    }

    /**
     * Sets the value of the shrMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OutputChannelDetailsXsys02700101 setShrMd(String value) {
        this.shrMd = value;
        return this;
    }

    /**
     * StoreAndForwardSessionId
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnFSessionId() {
        return snFSessionId;
    }

    /**
     * Sets the value of the snFSessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OutputChannelDetailsXsys02700101 setSnFSessionId(String value) {
        this.snFSessionId = value;
        return this;
    }

    /**
     * Gets the value of the ackPndng property.
     * 
     * @return
     *     possible object is
     *     {@link SwBooleanIndicator }
     *     
     */
    public SwBooleanIndicator getAckPndng() {
        return ackPndng;
    }

    /**
     * Sets the value of the ackPndng property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwBooleanIndicator }
     *     
     */
    public OutputChannelDetailsXsys02700101 setAckPndng(SwBooleanIndicator value) {
        this.ackPndng = value;
        return this;
    }

    /**
     * Subset Gets the value of the subset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubset() {
        if (subset == null) {
            subset = new ArrayList<String>();
        }
        return this.subset;
    }

    /**
     * WindowSize
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindowSize() {
        return windowSize;
    }

    /**
     * Sets the value of the windowSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OutputChannelDetailsXsys02700101 setWindowSize(String value) {
        this.windowSize = value;
        return this;
    }

    /**
     * LastSnFOutputSequence
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastSnFOutputSeq() {
        return lastSnFOutputSeq;
    }

    /**
     * Sets the value of the lastSnFOutputSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OutputChannelDetailsXsys02700101 setLastSnFOutputSeq(String value) {
        this.lastSnFOutputSeq = value;
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
     * Adds a new item to the subset list.
     * @see #getSubset()
     * 
     */
    public OutputChannelDetailsXsys02700101 addSubset(String subset) {
        getSubset().add(subset);
        return this;
    }

}
