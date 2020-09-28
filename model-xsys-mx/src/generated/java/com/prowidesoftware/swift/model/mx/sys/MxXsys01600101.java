
package com.prowidesoftware.swift.model.mx.sys;

import com.prowidesoftware.swift.model.mx.sys.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for xsys.016.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "xsys01600101"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:xsys.016.001.01")
public class MxXsys01600101
    extends AbstractMX
{

    @XmlElement(name = "xsys.016.001.01", required = true)
    protected RetrievalReport xsys01600101;
    public final static transient String BUSINESS_PROCESS = "xsys";
    public final static transient int FUNCTIONALITY = 16;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {DeliverySummary.class, MxXsys01600101 .class, PossibleDuplicateMessage.class, PossibleDuplicateMessageList.class, ReportInfo.class, RequestReferenceXsys01600101 .class, ResultCode.class, RetrievalReport.class, RetrievedInputMessage.class, RetrievedInputMessageList.class, RetrievedMessageList.class, RetrievedOutputMessage.class, RetrievedOutputMessageList.class, SwBooleanIndicator.class, UndeliveredMessageXsys01600101 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:xsys.016.001.01";

    public MxXsys01600101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxXsys01600101(final String xml) {
        this();
        MxXsys01600101 tmp = parse(xml);
        xsys01600101 = tmp.getXsys01600101();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxXsys01600101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the xsys01600101 property.
     * 
     * @return
     *     possible object is
     *     {@link RetrievalReport }
     *     
     */
    public RetrievalReport getXsys01600101() {
        return xsys01600101;
    }

    /**
     * Sets the value of the xsys01600101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrievalReport }
     *     
     */
    public MxXsys01600101 setXsys01600101(RetrievalReport value) {
        this.xsys01600101 = value;
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

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxXsys01600101 parse(String xml) {
        return ((MxXsys01600101) MxReadImpl.parse(MxXsys01600101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxXsys01600101 parse(String xml, MxRead parserImpl) {
        return ((MxXsys01600101) parserImpl.read(MxXsys01600101 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxXsys01600101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxXsys01600101 message
     * @return
     *     a new instance of MxXsys01600101
     */
    public final static MxXsys01600101 fromJson(String json) {
        return AbstractMX.fromJson(json, MxXsys01600101 .class);
    }

}
