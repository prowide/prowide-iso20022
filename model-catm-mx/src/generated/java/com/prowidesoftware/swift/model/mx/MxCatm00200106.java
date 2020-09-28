
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
 * Class for catm.002.001.06 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mgmtPlanRplcmnt"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:catm.002.001.06")
public class MxCatm00200106
    extends AbstractMX
{

    @XmlElement(name = "MgmtPlanRplcmnt", required = true)
    protected ManagementPlanReplacementV06 mgmtPlanRplcmnt;
    public final static transient String BUSINESS_PROCESS = "catm";
    public final static transient int FUNCTIONALITY = 2;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 6;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {Algorithm11Code.class, Algorithm12Code.class, Algorithm13Code.class, Algorithm14Code.class, Algorithm15Code.class, Algorithm7Code.class, Algorithm8Code.class, AlgorithmIdentification11 .class, AlgorithmIdentification12 .class, AlgorithmIdentification13 .class, AlgorithmIdentification14 .class, AlgorithmIdentification15 .class, AlgorithmIdentification16 .class, AlgorithmIdentification17 .class, AttributeType1Code.class, AuthenticatedData4 .class, BytePadding1Code.class, CertificateIssuer1 .class, ContentInformationType12 .class, ContentType2Code.class, DataSetCategory9Code.class, DataSetIdentification6 .class, DigestedData4 .class, EncapsulatedContent3 .class, EncryptedContent3 .class, EncryptionFormat1Code.class, EnvelopedData4 .class, ErrorAction3 .class, GenericIdentification71 .class, GenericIdentification92 .class, Header27 .class, IssuerAndSerialNumber1 .class, KEK4 .class, KEKIdentifier2 .class, KeyTransport4 .class, ManagementPlan6 .class, ManagementPlanContent6 .class, ManagementPlanReplacementV06 .class, MxCatm00200106 .class, NetworkParameters4 .class, NetworkParameters5 .class, NetworkType1Code.class, Parameter4 .class, Parameter5 .class, Parameter6 .class, Parameter7 .class, Parameter8 .class, PartyType5Code.class, PartyType6Code.class, ProcessRetry2 .class, ProcessTiming3 .class, Recipient4Choice.class, Recipient5Choice.class, RelativeDistinguishedName1 .class, SignedData4 .class, Signer3 .class, TMSAction6 .class, TerminalManagementAction2Code.class, TerminalManagementActionResult3Code.class, TerminalManagementActionTrigger1Code.class, TerminalManagementAdditionalProcess1Code.class, TerminalManagementDataSet22 .class, TerminalManagementErrorAction2Code.class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:catm.002.001.06";

    public MxCatm00200106() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxCatm00200106(final String xml) {
        this();
        MxCatm00200106 tmp = parse(xml);
        mgmtPlanRplcmnt = tmp.getMgmtPlanRplcmnt();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxCatm00200106(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mgmtPlanRplcmnt property.
     * 
     * @return
     *     possible object is
     *     {@link ManagementPlanReplacementV06 }
     *     
     */
    public ManagementPlanReplacementV06 getMgmtPlanRplcmnt() {
        return mgmtPlanRplcmnt;
    }

    /**
     * Sets the value of the mgmtPlanRplcmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagementPlanReplacementV06 }
     *     
     */
    public MxCatm00200106 setMgmtPlanRplcmnt(ManagementPlanReplacementV06 value) {
        this.mgmtPlanRplcmnt = value;
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
    public static MxCatm00200106 parse(String xml) {
        return ((MxCatm00200106) MxReadImpl.parse(MxCatm00200106 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxCatm00200106 parse(String xml, MxRead parserImpl) {
        return ((MxCatm00200106) parserImpl.read(MxCatm00200106 .class, xml, _classes));
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
     * Creates an MxCatm00200106 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxCatm00200106 message
     * @return
     *     a new instance of MxCatm00200106
     */
    public final static MxCatm00200106 fromJson(String json) {
        return AbstractMX.fromJson(json, MxCatm00200106 .class);
    }

}
