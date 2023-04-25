
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
 * Class for seev.048.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "shrhldrIdDsclsrRspnCxlAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.048.001.01")
public class MxSeev04800101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ShrhldrIdDsclsrRspnCxlAdvc", required = true)
    protected ShareholderIdentificationDisclosureResponseCancellationAdviceV01 shrhldrIdDsclsrRspnCxlAdvc;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 48;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {DateAndDateTime2Choice.class, DateCode20Choice.class, DateFormat46Choice.class, DateType1Code.class, DisclosureRequestIdentification1 .class, GenericIdentification30 .class, GenericIdentification36 .class, IdentificationSource3Choice.class, MxSeev04800101 .class, OtherIdentification1 .class, PartyIdentification195Choice.class, PartyIdentification215 .class, SecurityIdentification19 .class, ShareholderIdentificationDisclosureResponseCancellationAdviceV01 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.048.001.01";

    public MxSeev04800101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev04800101(final String xml) {
        this();
        MxSeev04800101 tmp = parse(xml);
        shrhldrIdDsclsrRspnCxlAdvc = tmp.getShrhldrIdDsclsrRspnCxlAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev04800101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the shrhldrIdDsclsrRspnCxlAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link ShareholderIdentificationDisclosureResponseCancellationAdviceV01 }
     *     
     */
    public ShareholderIdentificationDisclosureResponseCancellationAdviceV01 getShrhldrIdDsclsrRspnCxlAdvc() {
        return shrhldrIdDsclsrRspnCxlAdvc;
    }

    /**
     * Sets the value of the shrhldrIdDsclsrRspnCxlAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareholderIdentificationDisclosureResponseCancellationAdviceV01 }
     *     
     */
    public MxSeev04800101 setShrhldrIdDsclsrRspnCxlAdvc(ShareholderIdentificationDisclosureResponseCancellationAdviceV01 value) {
        this.shrhldrIdDsclsrRspnCxlAdvc = value;
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
    public static MxSeev04800101 parse(String xml) {
        return ((MxSeev04800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev04800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev04800101 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev04800101) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev04800101 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev04800101 parse(String xml, MxRead parserImpl) {
        return ((MxSeev04800101) parserImpl.read(MxSeev04800101 .class, xml, _classes));
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
     * Creates an MxSeev04800101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev04800101 message
     * @return
     *     a new instance of MxSeev04800101
     */
    public static final MxSeev04800101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev04800101 .class);
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
