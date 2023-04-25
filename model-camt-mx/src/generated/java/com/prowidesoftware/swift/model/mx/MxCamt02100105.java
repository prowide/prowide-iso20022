
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
 * Class for camt.021.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rtrGnlBizInf"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.021.001.05")
public class MxCamt02100105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "RtrGnlBizInf", required = true)
    protected ReturnGeneralBusinessInformationV05 rtrGnlBizInf;
    public static final transient String BUSINESS_PROCESS = "camt";
    public static final transient int FUNCTIONALITY = 21;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ErrorHandling1Code.class, ErrorHandling2Choice.class, ErrorHandling4 .class, GeneralBusinessInformation1 .class, GeneralBusinessOrError5Choice.class, GeneralBusinessOrError6Choice.class, GeneralBusinessReport5 .class, GenericIdentification1 .class, InformationQualifierType1 .class, MessageHeader7 .class, MxCamt02100105 .class, OriginalBusinessQuery1 .class, Priority1Code.class, RequestType4Choice.class, ReturnGeneralBusinessInformationV05 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public static final transient String NAMESPACE = "urn:swift:xsd:camt.021.001.05";

    public MxCamt02100105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCamt02100105(final String xml) {
        this();
        MxCamt02100105 tmp = parse(xml);
        rtrGnlBizInf = tmp.getRtrGnlBizInf();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCamt02100105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the rtrGnlBizInf property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnGeneralBusinessInformationV05 }
     *     
     */
    public ReturnGeneralBusinessInformationV05 getRtrGnlBizInf() {
        return rtrGnlBizInf;
    }

    /**
     * Sets the value of the rtrGnlBizInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnGeneralBusinessInformationV05 }
     *     
     */
    public MxCamt02100105 setRtrGnlBizInf(ReturnGeneralBusinessInformationV05 value) {
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
    public static MxCamt02100105 parse(String xml) {
        return ((MxCamt02100105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt02100105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxCamt02100105 parse(String xml, MxReadConfiguration conf) {
        return ((MxCamt02100105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxCamt02100105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCamt02100105 parse(String xml, MxRead parserImpl) {
        return ((MxCamt02100105) parserImpl.read(MxCamt02100105 .class, xml, _classes));
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
     * Creates an MxCamt02100105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCamt02100105 message
     * @return
     *     a new instance of MxCamt02100105
     */
    public static final MxCamt02100105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxCamt02100105 .class);
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
