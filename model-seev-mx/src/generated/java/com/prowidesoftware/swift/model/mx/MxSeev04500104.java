
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
 * Class for seev.045.001.04 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "shrhldrsIdDsclsrReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.045.001.04")
public class MxSeev04500104
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ShrhldrsIdDsclsrReq", required = true)
    protected ShareholdersIdentificationDisclosureRequestV04 shrhldrsIdDsclsrReq;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 45;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 4;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AddressType2Code.class, DateAndDateTime2Choice.class, DateCalculationMethod1Code.class, DateCode20Choice.class, DateFormat46Choice.class, DateType1Code.class, DisclosureRequestType1Code.class, GenericIdentification30 .class, GenericIdentification36 .class, IdentificationSource3Choice.class, MxSeev04500104 .class, NameAndAddress5 .class, OtherIdentification1 .class, PartyAddress1 .class, PartyIdentification129Choice.class, PartyIdentification203Choice.class, PartyIdentification214 .class, PostalAddress1 .class, PostalAddress26 .class, RequestShareHeldDate1Choice.class, SecurityIdentification19 .class, ShareholdersIdentificationDisclosureRequestV04 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.045.001.04";

    public MxSeev04500104() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev04500104(final String xml) {
        this();
        MxSeev04500104 tmp = parse(xml);
        shrhldrsIdDsclsrReq = tmp.getShrhldrsIdDsclsrReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev04500104(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the shrhldrsIdDsclsrReq property.
     * 
     * @return
     *     possible object is
     *     {@link ShareholdersIdentificationDisclosureRequestV04 }
     *     
     */
    public ShareholdersIdentificationDisclosureRequestV04 getShrhldrsIdDsclsrReq() {
        return shrhldrsIdDsclsrReq;
    }

    /**
     * Sets the value of the shrhldrsIdDsclsrReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareholdersIdentificationDisclosureRequestV04 }
     *     
     */
    public MxSeev04500104 setShrhldrsIdDsclsrReq(ShareholdersIdentificationDisclosureRequestV04 value) {
        this.shrhldrsIdDsclsrReq = value;
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
    public static MxSeev04500104 parse(String xml) {
        return ((MxSeev04500104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev04500104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev04500104 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev04500104) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev04500104 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev04500104 parse(String xml, MxRead parserImpl) {
        return ((MxSeev04500104) parserImpl.read(MxSeev04500104 .class, xml, _classes));
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
     * Creates an MxSeev04500104 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev04500104 message
     * @return
     *     a new instance of MxSeev04500104
     */
    public static final MxSeev04500104 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev04500104 .class);
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
