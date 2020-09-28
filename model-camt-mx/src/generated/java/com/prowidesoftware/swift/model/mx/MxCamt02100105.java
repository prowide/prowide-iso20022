
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
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
 * Class for camt.021.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "rtrGnlBizInf"
})
@XmlRootElement(name = "Document", namespace = "urn:swift:xsd:camt.021.001.05")
public class MxCamt02100105
    extends AbstractMX
{

    @XmlElement(name = "RtrGnlBizInf", required = true)
    protected ReturnGeneralBusinessInformationV05 rtrGnlBizInf;
    public final static transient String BUSINESS_PROCESS = "camt";
    public final static transient int FUNCTIONALITY = 21;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ErrorHandling1Code.class, ErrorHandling2Choice.class, ErrorHandling4 .class, GeneralBusinessInformation1 .class, GeneralBusinessOrError5Choice.class, GeneralBusinessOrError6Choice.class, GeneralBusinessReport5 .class, GenericIdentification1 .class, InformationQualifierType1 .class, MessageHeader7 .class, MxCamt02100105 .class, OriginalBusinessQuery1 .class, Priority1Code.class, RequestType4Choice.class, ReturnGeneralBusinessInformationV05 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:swift:xsd:camt.021.001.05";

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
    public static MxCamt02100105 parse(String xml) {
        return ((MxCamt02100105) MxReadImpl.parse(MxCamt02100105 .class, xml, _classes));
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
    public final static MxCamt02100105 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCamt02100105 .class);
    }

}
