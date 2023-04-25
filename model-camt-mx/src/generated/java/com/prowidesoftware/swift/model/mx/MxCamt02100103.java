
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for camt.021.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rtrGnlBizInf"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.021.001.03")
public class MxCamt02100103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RtrGnlBizInf", required = true)
    protected ReturnGeneralBusinessInformationV03 rtrGnlBizInf;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 21;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ErrorHandling1Choice.class, ErrorHandling1Code.class, ErrorHandling3 .class, GeneralBusinessInformation.class, GeneralBusinessOrError1Choice.class, GeneralBusinessOrError2Choice.class, GeneralBusinessReport3 .class, GenericIdentification1 .class, InformationQualifierType.class, MessageHeader3 .class, MxCamt02100103 .class, OriginalBusinessQuery1 .class, Priority1Code.class, RequestType1Code.class, RequestType2Choice.class, RequestType2Code.class, ReturnGeneralBusinessInformationV03 .class };
    public static final transient String NAMESPACE = "urn:swift:xsd:camt.021.001.03";

    public MxCamt02100103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt02100103(final String xml) {
        this();
        MxCamt02100103 tmp = parse(xml);
        rtrGnlBizInf = tmp.getRtrGnlBizInf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt02100103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rtrGnlBizInf property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnGeneralBusinessInformationV03 }
     *     
     */
    public ReturnGeneralBusinessInformationV03 getRtrGnlBizInf() {
        return rtrGnlBizInf;
    }

    /**
     * Sets the value of the rtrGnlBizInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnGeneralBusinessInformationV03 }
     *     
     */
    public MxCamt02100103 setRtrGnlBizInf(ReturnGeneralBusinessInformationV03 value) {
        this.rtrGnlBizInf = value;
        return this;
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxCamt02100103 parse(String xml) {
        return ((MxCamt02100103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt02100103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt02100103 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt02100103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt02100103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt02100103 parse(String xml, MxRead parserImpl) {
        return ((MxCamt02100103) parserImpl.read(MxCamt02100103 .class, xml, _classes));
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
     * Creates an MxCamt02100103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt02100103 message
     * @return
     *     a new instance of MxCamt02100103
     */
    public static final MxCamt02100103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt02100103 .class);
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
