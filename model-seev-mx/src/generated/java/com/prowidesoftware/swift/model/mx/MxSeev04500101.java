
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for seev.045.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "shrhldrsIdDsclsrReq"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.045.001.01")
public class MxSeev04500101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "ShrhldrsIdDsclsrReq", required = true)
    protected ShareholdersIdentificationDisclosureRequestV01 shrhldrsIdDsclsrReq;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 45;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AddressType2Code.class, DateAndDateTime2Choice.class, DateCalculationMethod1Code.class, DateCode20Choice.class, DateFormat46Choice.class, DateType1Code.class, DisclosureRequestType1Code.class, GenericIdentification30 .class, GenericIdentification36 .class, IdentificationSource3Choice.class, MxSeev04500101 .class, NameAndAddress5 .class, OtherIdentification1 .class, PartyAddress1 .class, PartyIdentification129Choice.class, PartyIdentification203Choice.class, PartyIdentification214 .class, PostalAddress1 .class, PostalAddress26 .class, RequestShareHeldDate1Choice.class, SecurityIdentification19 .class, ShareholdersIdentificationDisclosureRequestV01 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.045.001.01";

    public MxSeev04500101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev04500101(final String xml) {
        this();
        MxSeev04500101 tmp = parse(xml);
        shrhldrsIdDsclsrReq = tmp.getShrhldrsIdDsclsrReq();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev04500101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the shrhldrsIdDsclsrReq property.
     * 
     * @return
     *     possible object is
     *     {@link ShareholdersIdentificationDisclosureRequestV01 }
     *     
     */
    public ShareholdersIdentificationDisclosureRequestV01 getShrhldrsIdDsclsrReq() {
        return shrhldrsIdDsclsrReq;
    }

    /**
     * Sets the value of the shrhldrsIdDsclsrReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareholdersIdentificationDisclosureRequestV01 }
     *     
     */
    public MxSeev04500101 setShrhldrsIdDsclsrReq(ShareholdersIdentificationDisclosureRequestV01 value) {
        this.shrhldrsIdDsclsrReq = value;
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
    public static MxSeev04500101 parse(String xml) {
        return ((MxSeev04500101) MxReadImpl.parse(MxSeev04500101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev04500101 parse(String xml, MxRead parserImpl) {
        return ((MxSeev04500101) parserImpl.read(MxSeev04500101 .class, xml, _classes));
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
     * Creates an MxSeev04500101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev04500101 message
     * @return
     *     a new instance of MxSeev04500101
     */
    public final static MxSeev04500101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev04500101 .class);
    }

}
