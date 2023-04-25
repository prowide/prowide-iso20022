
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
 * Class for seev.046.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "shrhldrsIdDsclsrReqCxlAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.046.001.01")
public class MxSeev04600101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ShrhldrsIdDsclsrReqCxlAdvc", required = true)
    protected ShareholdersIdentificationDisclosureRequestCancellationAdviceV01 shrhldrsIdDsclsrReqCxlAdvc;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 46;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AddressType2Code.class, DateAndDateTime2Choice.class, DateCode20Choice.class, DateFormat46Choice.class, DateType1Code.class, DisclosureRequestCancellationReason1Code.class, DisclosureRequestIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, IdentificationSource3Choice.class, MxSeev04600101 .class, NameAndAddress5 .class, OtherIdentification1 .class, PartyIdentification129Choice.class, PostalAddress1 .class, SecurityIdentification19 .class, ShareholdersIdentificationDisclosureRequestCancellationAdviceV01 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.046.001.01";

    public MxSeev04600101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev04600101(final String xml) {
        this();
        MxSeev04600101 tmp = parse(xml);
        shrhldrsIdDsclsrReqCxlAdvc = tmp.getShrhldrsIdDsclsrReqCxlAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev04600101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the shrhldrsIdDsclsrReqCxlAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link ShareholdersIdentificationDisclosureRequestCancellationAdviceV01 }
     *     
     */
    public ShareholdersIdentificationDisclosureRequestCancellationAdviceV01 getShrhldrsIdDsclsrReqCxlAdvc() {
        return shrhldrsIdDsclsrReqCxlAdvc;
    }

    /**
     * Sets the value of the shrhldrsIdDsclsrReqCxlAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareholdersIdentificationDisclosureRequestCancellationAdviceV01 }
     *     
     */
    public MxSeev04600101 setShrhldrsIdDsclsrReqCxlAdvc(ShareholdersIdentificationDisclosureRequestCancellationAdviceV01 value) {
        this.shrhldrsIdDsclsrReqCxlAdvc = value;
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
    public static MxSeev04600101 parse(String xml) {
        return ((MxSeev04600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev04600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev04600101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev04600101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev04600101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev04600101 parse(String xml, MxRead parserImpl) {
        return ((MxSeev04600101) parserImpl.read(MxSeev04600101 .class, xml, _classes));
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
     * Creates an MxSeev04600101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev04600101 message
     * @return
     *     a new instance of MxSeev04600101
     */
    public static final MxSeev04600101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev04600101 .class);
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
